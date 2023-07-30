package com.example.facebookclone.fakers;


import com.example.facebookclone.model.FriendStatus;
import com.example.facebookclone.model.Friends;
import com.example.facebookclone.model.Users;
import com.github.javafaker.Faker;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class FriendFaker {
    @Autowired
    private Faker faker;
    @Enumerated(EnumType.STRING)
    private List<FriendStatus> friendStatuses;


    public FriendFaker() {
        this.friendStatuses = Arrays.asList(FriendStatus.values());
    }

    public Friends generate(Users user1, Users user2){
        Random random = new Random();
        int index = random.nextInt(friendStatuses.size());
        return new Friends(

                user1,
                user2,
                friendStatuses.get(index),
                user1,
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
