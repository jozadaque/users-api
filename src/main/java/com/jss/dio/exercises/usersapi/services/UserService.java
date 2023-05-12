package com.jss.dio.exercises.usersapi.services;

import com.jss.dio.exercises.usersapi.models.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

    List<User> getUsers();

    User getUserById(int id);

    User getUserByEmail(String email);

}
