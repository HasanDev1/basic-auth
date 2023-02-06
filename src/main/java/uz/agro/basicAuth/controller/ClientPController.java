package uz.agro.basicAuth.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.agro.basicAuth.service.agroService.PhisicalServise;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/physic")
public class ClientPController {

    private final PhisicalServise phisicalServise;

    @GetMapping("/seria-number")
    public ResponseEntity<?> findBySeriaAndPassport(@RequestParam(name = "seria") String seria, @RequestParam(name = "number") String number){
        return ResponseEntity.ok(phisicalServise.findBySeriaAndNumber(seria, number));
    }

    @GetMapping("/pinfl")
    public ResponseEntity<?>findByPinfl(@RequestParam(name = "pinfl") String pinfl){
        return ResponseEntity.ok(phisicalServise.findByPinfl(pinfl));
    }

    @GetMapping("/pinfl-seria-number")
    public ResponseEntity<?>findByPinflSeriaNumber(@RequestParam(name = "pinfl") String pinfl, @RequestParam(name = "seria") String seria, @RequestParam(name = "number") String number){
        return ResponseEntity.ok(phisicalServise.findByPinflAndSeriaAndNumber(pinfl, seria, number));
    }
    @GetMapping("/seria-number-birthday")
    public ResponseEntity<?> findBySeriaNumberBirthday(@RequestParam(name = "seria") String seria, @RequestParam(name = "number") String number, @RequestParam(name = "birthday") String birthday){
        return ResponseEntity.ok(phisicalServise.findBySeriaAndNumberAndBirthday(seria, number, birthday));
    }

    @GetMapping("/pinfl-birthday")
    public ResponseEntity<?> findByPinflAndBirthday(@RequestParam(name = "pinfl") String pinfl, @RequestParam(name = "birthday") String birthday){
        return ResponseEntity.ok(phisicalServise.finByPinflAndBirthday(pinfl, birthday));
    }
}
