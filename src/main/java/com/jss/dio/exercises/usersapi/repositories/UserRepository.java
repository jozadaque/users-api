package com.jss.dio.exercises.usersapi.repositories;

import com.jss.dio.exercises.usersapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository  extends JpaRepository<User, Integer> {

}
