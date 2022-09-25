package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.TaskRepositorio;
import com.example.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User createUser(User newUser){
        return this.repository.save(newUser);
    }

    public User findUserByEmail(String email){
        return this.repository.findByEmail(email);
    }

    public User getOrCreateUser(Map<String, Object> userData){
        String email = userData.get("email").toString();
        User user = findUserByEmail(email);
        if (user==null){
            String name = userData.get("name").toString();
            String image = userData.get("picture").toString();
            String auth0Id = userData.get("sub").toString();
            User newUser = new User(email, image, auth0Id);
            return createUser(newUser);
        }
        return user;
    }

}
