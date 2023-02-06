package uz.agro.basicAuth.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import uz.agro.basicAuth.security.JwtUserDetailsService;
import uz.agro.basicAuth.security.jwt.JwtAuthenticationExeption;
import uz.agro.basicAuth.security.jwt.JwtTokenFilter;


import javax.servlet.Filter;

@EnableWebSecurity
@Configuration
@RequiredArgsConstructor
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SecurityConfiguration extends GlobalMethodSecurityConfiguration {

    @Autowired
    private JwtUserDetailsService userDetailsService;
    private final JwtTokenFilter filter;
    private final JwtAuthenticationExeption jwtAuthenticationExeption;

    @Bean
    public AuthenticationManager authManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailsService userDetailsService)
            throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService)
                .passwordEncoder(bCryptPasswordEncoder)
                .and()
                .build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public DaoAuthenticationProvider provider(){
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setPasswordEncoder(new BCryptPasswordEncoder());
//        provider.setUserDetailsService(userDetailsService);
//        return provider;
//    }

    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
        security
                .cors().disable()
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/test/admin").hasRole("ADMIN")
                .antMatchers("/test/user").hasRole("USER")
                .antMatchers("/swagger-ui.html","/webjars/**","/swagger-resources","/swagger-resources/**","/v2/**","/csrf").permitAll()
                .anyRequest().authenticated().and()
                .httpBasic().and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .exceptionHandling().authenticationEntryPoint(jwtAuthenticationExeption)
                .and()
                .addFilterBefore( filter, UsernamePasswordAuthenticationFilter.class);

        return security.build();
    }



}
