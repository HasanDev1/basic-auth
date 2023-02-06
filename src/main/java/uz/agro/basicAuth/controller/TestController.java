package uz.agro.basicAuth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.agro.basicAuth.security.jwt.SecurityUtils;

@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class TestController {

    private final SecurityUtils utils;

//    @PreAuthorize("hasAnyRole('ROLE_USER')")
    @GetMapping("/user")
    public String getUser(){
        return "this is User";
    }

//    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String getAdmin(){
        return "this is Admin";
    }

    @GetMapping("/me")
    public String getMe(){
        return utils.getCurrentUser().toString();
    }
}
