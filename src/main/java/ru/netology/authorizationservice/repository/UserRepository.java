package ru.netology.authorizationservice.repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservice.Authorities;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {

    private final ConcurrentHashMap<ConcurrentHashMap<String, String>, List<Authorities>> authorities;

    public UserRepository() {
        this.authorities = new ConcurrentHashMap<>();

        this.authorities.put(addUser("Maxim", "1234"), List.of(Authorities.WRITE));
        this.authorities.put(addUser("Valera", "qwerty"), List.of(Authorities.values()));
        this.authorities.put(addUser("Natasha", "0000"), List.of(Authorities.DELETE));

    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (!user.isEmpty() && !password.isEmpty()) {
            return authorities.getOrDefault(addUser(user, password), Collections.emptyList());
        }
        return Collections.emptyList();
    }

    public ConcurrentHashMap<String, String> addUser(String user, String password) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put(user, password);
        return map;
    }
}


