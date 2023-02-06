package uz.agro.basicAuth.service.agroService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.agro.basicAuth.entity.agroEntity.Client_p;
import uz.agro.basicAuth.repository.agroRepository.ClientPRepository;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PhisicalServise {

    private final ClientPRepository pRepository;

    public ResponseEntity<?> findByPinfl(String pinfl){
        List<Client_p> clientPList = null;
        try {
            clientPList = pRepository.findByPinfl(pinfl);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e);
        }
        log.info("find by pinfl: {}", clientPList);
        return ResponseEntity.ok(clientPList);
    }

    public ResponseEntity<?> findBySeriaAndNumber(String seria, String number){
        List<Client_p> clientPList = null;
        try {
            clientPList = pRepository.findBySeriyaAndNumber(seria, number);
        }
        catch (Exception e){
            return ResponseEntity.badRequest().body(e);
        }
        log.info("find by seria and number of passport: {}", clientPList);
        return ResponseEntity.ok(clientPList);
    }

    public ResponseEntity<?> findByPinflAndSeriaAndNumber(String pinfl, String seria, String number){
        List<Client_p> clientPList = null;
        try {
            clientPList = pRepository.findByPinflAndSeriyaAndNumber(pinfl, seria, number);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e);
        }
        log.info("find by pinfl and seria and number of passport: {}", clientPList);
        return ResponseEntity.ok(clientPList);
    }

    public ResponseEntity<?> findBySeriaAndNumberAndBirthday(String seria, String number, String birthday){
        List<Client_p> clientPList = null;
        try {
            clientPList = pRepository.findByPassportserialAndNumberAndBirthday(seria, number, birthday);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e);
        }
        log.info("find by seria and number and birthday: {}", clientPList);
        return ResponseEntity.ok(clientPList);
    }

    public ResponseEntity<?> finByPinflAndBirthday(String pinfl, String birthday){
        List<Client_p>clientPList = null;
        try {
            clientPList = pRepository.findByPinflAndBirthday(pinfl, birthday);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e);
        }
        log.info("find by pinfl and birthday: {}", clientPList);
        return ResponseEntity.ok(clientPList);
    }

}
