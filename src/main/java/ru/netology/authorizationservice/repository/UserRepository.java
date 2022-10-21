package ru.netology.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservice.Authorities;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        if(!user.isEmpty() && !password.isEmpty()) {
            return List.of(Authorities.values());
        } else {
            return Collections.emptyList();
        }
    }
}
