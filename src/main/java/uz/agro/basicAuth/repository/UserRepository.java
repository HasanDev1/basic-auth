package uz.agro.basicAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.agro.basicAuth.entity.Users;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<Users, UUID> {
    Users findByUsername(String username);
}
