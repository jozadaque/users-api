package com.jss.dio.exercises.usersapi.services.Impl;

import com.jss.dio.exercises.usersapi.models.User;
import com.jss.dio.exercises.usersapi.repositories.UserRepository;
import com.jss.dio.exercises.usersapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public void addUser(User user) {
      repository.save(user);
    }

    @Override
    public void updateUser(User user) {
     repository.save(user);
    }

    @Override
    public void deleteUser(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = repository.findAll();
        return users;
    }

    @Override
    public User getUserById(int id) {
        Optional<User> userMap = repository.findById(id);
          if(userMap.isEmpty()){
              return null;
          }
          User user =  userMap.map(
               u -> new User(
                       u.getId(),u.getName(), u.getUsername(),u.getName(),u.getAddress(), u.getPhone(), u.getWebsite(), u.getCompany()
               )

       ).stream().toList().get(0);

     return user;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }
}
