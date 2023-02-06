package uz.agro.basicAuth.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Roles implements GrantedAuthority {

    @Id
    private Long id;
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
