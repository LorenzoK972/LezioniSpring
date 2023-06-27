package com.example.springinizio.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user")//Crea una tabella
public class User {
    @Id //primary key
    @Column(name = "id")//Imposta il nome della colonna
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincremento id
    private Integer id;
    private String password;
    private String username;

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
