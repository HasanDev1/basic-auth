package uz.agro.basicAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.agro.basicAuth.entity.Roles;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {
    List<Roles> findByName(String rolName);
}
