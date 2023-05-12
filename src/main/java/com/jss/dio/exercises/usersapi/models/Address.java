package com.jss.dio.exercises.usersapi.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {

    private  String street;
    private String  suite;
    private String city;
    private String zipcode;

    @Embedded
    private Geo geo;

}
