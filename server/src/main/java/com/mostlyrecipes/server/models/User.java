package com.mostlyrecipes.server.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Email // checks for valid email format
    @Column (nullable = false, unique = true)
    private String email;

    @ValidPassword
    @Column(nullable = false, length = 255)
    private String password;
}
