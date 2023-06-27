package com.example.springinizio.controller;

import com.example.springinizio.Service.UserService;
import com.example.springinizio.controller.DTO.SaveUserRequest;
import com.example.springinizio.entities.User;
import com.example.springinizio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @Autowired
    private UserService userService;

    @PostMapping ("/save")
    public User saveUser (@RequestBody SaveUserRequest saveUserRequest){

        return userService.save(saveUserRequest);

    }
}
