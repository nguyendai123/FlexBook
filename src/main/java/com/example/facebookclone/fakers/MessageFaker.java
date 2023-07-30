package com.example.facebookclone.fakers;

import com.example.facebookclone.model.Messages;
import com.example.facebookclone.model.Users;


import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MessageFaker {
    @Autowired
    private Faker faker;

    public Messages generate(Users sender, Users receiver){
        return new Messages(
                sender,
                receiver,
                faker.lorem().sentence(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
