package com.example.facebookclone.fakers;

import com.example.facebookclone.model.Likes;
import com.example.facebookclone.model.Posts;
import com.example.facebookclone.model.Users;


import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class LikeFaker {
    @Autowired
    private Faker faker;

    public Likes generate(Users user, Posts post){
        List<Likes> likes = new ArrayList<>();
        return new Likes(
                user,
                post,
                LocalDateTime.now()
        );
    }
}
