package com.jss.dio.exercises.usersapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 60, unique = true)
    private String username;
    @Column(nullable = false,length = 50, unique = true)
    private String email;
    @Embedded
    private Address address;

    private String phone;
    private String website;

    @Embedded
    private Company company;

}
