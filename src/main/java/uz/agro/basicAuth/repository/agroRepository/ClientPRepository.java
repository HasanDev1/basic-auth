package uz.agro.basicAuth.repository.agroRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.agro.basicAuth.entity.agroEntity.Client_p;

import java.util.List;

@Repository
public interface ClientPRepository extends JpaRepository<Client_p, String> {
    @Query("select p from Client_p p where p.passport_serial = ?1 and p.passport_number = ?2 and p.state = 2")
    List<Client_p> findBySeriyaAndNumber( String seriya, String number);

    @Query("select p from Client_p p where p.pinfl = ?1 and p.state = 2")
    List<Client_p> findByPinfl(String pinfl);

    @Query("select p from Client_p p where p.passport_serial = ?1 and p.passport_number = ?2 and p.birthday = ?3 and p.state = 2")
    List<Client_p> findByPassportserialAndNumberAndBirthday( String pSerial, String pNumber, String birthday);

    @Query("select p from Client_p p where p.pinfl = ?1 and p.birthday = ?2 and p.state = 2")
    List<Client_p> findByPinflAndBirthday(String pinfl, String birthday);

    @Query("select p from Client_p p where p.pinfl = ?1 and p.passport_serial = ?2 and p.passport_number = ?3 and p.state = 2")
    List<Client_p> findByPinflAndSeriyaAndNumber(String pinfl, String seriya, String number);

//    @Query("select new com.javatechie.spring.security.api.payload.AccountResp(a.ID) from Account a where a.CLIENT = ?1 and a.BRANCH = ?2 ")
//    List<AccountResp>getAccountByUnicalAndBranch(String unical, String branch);





}
