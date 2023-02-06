package uz.agro.basicAuth.security.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;
import uz.agro.basicAuth.security.JwtUserDetailsService;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;

@RequiredArgsConstructor
@Component
public class JwtTokenFilter extends GenericFilterBean {
    private final JwtUserDetailsService userDetailsService;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String authorizationHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        System.out.println("authorizationHeader:  "+authorizationHeader);
        String[] user = null;
        try {
            authorizationHeader = authorizationHeader.substring(6);
            byte[] decodedBytes = Base64.getDecoder().decode(authorizationHeader);
            String decodedString = new String(decodedBytes);
            System.out.println("decode base64:  "+decodedString);
            user  = decodedString.split(":");
            System.out.println(user[0]);

            UserDetails userDetails = userDetailsService.loadUserByUsername(user[0]);
            System.out.println(userDetails);
            Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
            if (authentication != null){
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
