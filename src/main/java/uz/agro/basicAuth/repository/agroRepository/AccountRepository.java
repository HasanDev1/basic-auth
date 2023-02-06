package uz.agro.basicAuth.repository.agroRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.agro.basicAuth.entity.agroEntity.Account;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

}
