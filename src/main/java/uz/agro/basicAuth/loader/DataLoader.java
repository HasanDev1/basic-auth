package uz.agro.basicAuth.loader;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import uz.agro.basicAuth.entity.Admin;
import uz.agro.basicAuth.entity.Roles;
import uz.agro.basicAuth.entity.Status;
import uz.agro.basicAuth.entity.Users;
import uz.agro.basicAuth.repository.OwnerRepository;
import uz.agro.basicAuth.repository.RoleRepository;
import uz.agro.basicAuth.repository.UserRepository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final OwnerRepository adminRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        Roles roleAdmin = new Roles(1L, "ROLE_ADMIN");
        Roles roleUser = new Roles(2L, "ROLE_USER");

        List<Roles> rolesList = new ArrayList<>(Arrays.asList(roleAdmin, roleUser));
        roleRepository.saveAll(rolesList);

        Admin admin = new Admin();
        admin.setFirstName("Hasan");
        admin.setLastName("Baxriddinov");
//        admin.setPhone("+998946375138");
//        admin.setBirthday(new SimpleDateFormat("dd/MM/yyyy").parse("24/03/1998"));
        admin.setEmail("yoshlar1998@mail.ru");
        admin.setUsername("admin");
        admin.setPassword(passwordEncoder.encode("adminPass"));
        admin.setStatus(Status.ACTIVE);
        admin.setWho("admin");
        admin.setRolesList(rolesList);
        adminRepository.save(admin);

        Users users = new Users();
        users.setFirstName("User1");
        users.setLastName("Fam1");
        users.setEmail("user@mail.ru");
        users.setPassword(passwordEncoder.encode("userPass"));
        users.setUsername("user");
        users.setStatus(Status.ACTIVE);
        users.setRolesList(Arrays.asList(roleUser));
        userRepository.save(users);
    }

}
