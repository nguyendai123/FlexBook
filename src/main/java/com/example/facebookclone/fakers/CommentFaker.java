package com.example.facebookclone.fakers;

import com.example.facebookclone.model.Comments;
import com.example.facebookclone.model.Posts;
import com.example.facebookclone.model.Users;


import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.Comment;
import java.time.LocalDateTime;

@Component
public class CommentFaker {
    @Autowired
    private Faker faker;


    public Comments generate(Users user, Posts post){
        return new Comments(
                user,
                post,
                faker.lorem().sentence(),
                LocalDateTime.now(),
                LocalDateTime.now()
        );
    }
}
