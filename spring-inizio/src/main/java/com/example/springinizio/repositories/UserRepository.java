package com.example.springinizio.repositories;

import com.example.springinizio.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {  //Classe e chiave

}
