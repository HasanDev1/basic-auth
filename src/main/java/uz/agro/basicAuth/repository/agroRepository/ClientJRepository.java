package uz.agro.basicAuth.repository.agroRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.agro.basicAuth.entity.agroEntity.Client_j;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientJRepository extends JpaRepository<Client_j, String> {

    @Query("select j from Client_j j where j.ID = ?1 and j.STATE = 2")
    List<Client_j> findAllByID(String id);

    @Query("select j from Client_j j where j.NUMBER_TAX_REGISTRATION = ?1 and j.STATE = 2")
    List<Client_j> findAllByINN(String inn);

    @Query("select j from Client_j j where j.DIRECTOR_PINFL = ?1 and j.STATE = 2")
    List<Client_j> findAllByDIRECTOR_PINFL(String pinfl);

    @Query("select j from Client_j j where j.NUMBER_TAX_REGISTRATION = ?1 and j.STATE = 2")
    List<Client_j> findAllByINNorPINFl(String pinfl);

}
