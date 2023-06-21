package com.example.springinizio.controller;

import com.example.springinizio.entities.User;
import com.example.springinizio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/save")
    public void saveUser (){
        User user = new User();
        user.setUsername("root");
        user.setPassword("password");
        userRepository.save(user);

    }
}
