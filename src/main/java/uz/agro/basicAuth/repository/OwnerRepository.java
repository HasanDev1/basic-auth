package uz.agro.basicAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.agro.basicAuth.entity.Admin;

import java.util.UUID;

@Repository
public interface OwnerRepository extends JpaRepository<Admin, UUID> {
    Admin findByUsername(String username);
}
