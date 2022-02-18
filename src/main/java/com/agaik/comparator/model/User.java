package com.agaik.comparator.model;

import javax.persistence.*;

@Entity(name = "tuser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private String name;
    @Column(name = "password")
    private String pass;

    public User(int id, String username, String pass) {
        this.id = id;

        this.name = username;
        this.pass = pass;
    }

    public User(String username, String pass) {
        this.name = username;
        this.pass = pass;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String login) {
        this.name = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}