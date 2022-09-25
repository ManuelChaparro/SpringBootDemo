package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO) public long id;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="image")
    private String image;

    @Column(name="auth0id", unique = true)
    private String auth0id;

    public User(){}

    public User(String email, String image, String auth0id){
        this.email = email;
        this.image = image;
        this.auth0id = auth0id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuth0id() {
        return auth0id;
    }

    public void setAuth0id(String auth0id) {
        this.auth0id = auth0id;
    }
}
