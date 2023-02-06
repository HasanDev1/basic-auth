//package uz.agro.basicAuth.service.UserServiceImpl;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import uz.agro.basicAuth.entity.Users;
//import uz.agro.basicAuth.repository.UserRepository;
//import uz.agro.basicAuth.security.jwt.SecurityUtils;
//import uz.agro.basicAuth.service.UserService;
//
//
//@RequiredArgsConstructor
//@Slf4j
//@Service
//public class UserServiceImpl implements UserService {
//
//    private final UserRepository userRepository;
//    private final SecurityUtils securityUtils;
//
//    public Users findUserByUsername(String username){
//        Users users = userRepository.findByUsername(username);
//        if (users == null){
//            ResponseEntity.notFound();
//        }
//        return users;
//    }
//    @Override
//    public ResponseEntity<?> getMe(){
//        String username = securityUtils.getCurrentUser().orElseThrow(()->new RuntimeException("current user not found"));
//        return ResponseEntity.ok(userRepository.findByUsername(username));
//    }
//
//}
