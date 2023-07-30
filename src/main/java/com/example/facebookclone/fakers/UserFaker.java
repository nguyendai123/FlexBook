package com.example.facebookclone.fakers;

import com.example.facebookclone.model.Users;


import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserFaker {

    @Autowired
    private Faker faker ;

    public Users generate() {
        Users users = new Users();
        users.setUsername(faker.name().username());
        users.setEmail(faker.internet().emailAddress());
        users.setPassword(faker.internet().password());
        users.setProfilePicture(faker.internet().image());
        users.setBio(faker.lorem().sentence());
        users.setCreatedAt( LocalDateTime.now());
        users.setUpdatedAt(LocalDateTime.now());
        return users;
    }
}
