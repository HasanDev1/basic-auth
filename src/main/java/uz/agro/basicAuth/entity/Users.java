package uz.agro.basicAuth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import uz.agro.basicAuth.entity.abstractEntity.AbstractEntity;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//@EqualsAndHashCode
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users extends AbstractEntity {//implements UserDetails {

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "fk_users_Roles",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private List<Roles> rolesList;

//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        List<SimpleGrantedAuthority> authorities = this.rolesList.stream()
//                .map((roles) -> new SimpleGrantedAuthority(roles.getName())).collect(Collectors.toList());
//        return authorities;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
}
