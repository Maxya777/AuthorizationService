package ru.netology.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservice.Authorities;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private final ConcurrentHashMap<String, String> authorities;

    public UserRepository() {
        this.authorities = new ConcurrentHashMap<>();

        this.authorities.put("Maxim", "1234");
        this.authorities.put("Valera", "qwerty");
        this.authorities.put("Listochek123", "0000");
    }


    public List<Authorities> getUserAuthorities(String user, String password) {

        if (authorities.containsKey(user) && authorities.containsValue(password)) {
            return List.of(Authorities.values());
        } else {
            return Collections.emptyList();
        }
    }
}


