package com.jss.dio.exercises.usersapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Company {
    @Column(name = "company_name")
    private String name;
    private String catchPhrase;
    private String bs;
}
