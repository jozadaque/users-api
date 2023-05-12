package com.jss.dio.exercises.usersapi.controllers;


import com.jss.dio.exercises.usersapi.models.User;
import com.jss.dio.exercises.usersapi.services.Impl.UserServiceImpl;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @GetMapping
    public List<User> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id){
        return  service.getUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody List<User> user){

        for (User u:
             user) {
            service.addUser(u);
        }
    }

    @PostUpdate
    public void updateUser(@RequestBody  List<User> user){
        for (User u:
                user) {
            service.addUser(u);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        if(id > 0)  service.deleteUser(id);
    }
}
