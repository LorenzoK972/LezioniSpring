package com.example.springinizio.Service;

import com.example.springinizio.controller.DTO.SaveUserRequest;
import com.example.springinizio.entities.User;
import com.example.springinizio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(SaveUserRequest saveUserRequest) {
        //SELECT * FROM USER WHERE USERNAME = saveUserRequest.getUsername
        Optional<User> oUser = userRepository.findByUsername(saveUserRequest.getUsername());
        if(oUser.isPresent()) {
            throw new RuntimeException("Username: " + saveUserRequest.getUsername());
        } else {
            User user = new User(saveUserRequest.getUsername(), saveUserRequest.getPassword());
            user = userRepository.save(user);
            return user;
        }
    }
}
