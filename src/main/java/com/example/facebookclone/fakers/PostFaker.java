package com.example.facebookclone.fakers;

import com.example.facebookclone.model.Posts;
import com.example.facebookclone.model.Users;


import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class PostFaker {

    @Autowired
    private Faker faker;

    public Posts generate(Users user) {
        Posts posts = new Posts();
        posts.setUser(user);
        posts.setContent(faker.lorem().sentence());
        posts.setPostImage(faker.internet().image());
        posts.setCreatedAt( LocalDateTime.now());
        posts.setUpdatedAt(LocalDateTime.now());
        return posts;

    }
}