package com.example.facebookclone.service;

import com.example.facebookclone.model.Users;
import com.example.facebookclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
@Autowired
    private UserRepository repository;
    public List<Users> getAllUsers() {
        return repository.findAll();
    }
    public Users saveUsers(Users user) {
        return repository.save(user);
    }
    public String deleteUsers(Integer id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
    public Users getUsersById(Integer id) {
        Optional< Users > optional = repository.findById(id);
        Users user = null;
        if (optional.isPresent()) {
            user = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return user;
    }
    public void updateUsers(Users user) {
        this.repository.save(user);
    }

}


