package uz.agro.basicAuth.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.agro.basicAuth.entity.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public interface UserService {
//    public Users findUserByUsername(String username);
//    public ResponseEntity<?> getMe();
    public String getUsername(HttpServletRequest request, HttpServletResponse response) ;
}

