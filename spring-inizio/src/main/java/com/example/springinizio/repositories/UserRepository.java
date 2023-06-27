package com.example.springinizio.repositories;

import com.example.springinizio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //JpaRepository va a sostituire i dao e deve essere per forza un'interfaccia
public interface UserRepository extends JpaRepository<User, Integer> {
    //SELECT * FROM USER WHERE USERNAME = ?
    Optional<User> findByUsername(String username);  //Classe e chiave

}
