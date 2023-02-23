package com.example.spring_sec.Init;

import com.example.spring_sec.Repository.UserRepository;
import com.example.spring_sec.model.UserModelSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        UserModelSchema user = new UserModelSchema ();
        user.setName("Thiago");
        user.setUsername("thi123");
        user.setPassword("12345");
        user.setRoles(Collections.singletonList ("USERS"));
        repository.save(user);

        user = new UserModelSchema ();
        user.setName("ADMIN");
        user.setUsername("admin");
        user.setPassword("12345");
        user.setRoles(Collections.singletonList ("MANAGERS"));
        repository.save(user);
    }
}