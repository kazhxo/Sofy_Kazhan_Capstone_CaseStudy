package com.sofy.capstone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;


    @Column(nullable = false, unique = true)
    private String email;

    @Column
    private String profilePicture;

    @Column
    private String name;

    @Column
    private String bio;

    @Column
    private LocalDate dateOfBirth;

    @Column
    private String location;

    @Column
    private String gender;

    @Column
    private String interests;

    @OneToOne(mappedBy = "user1")
    private Friendship firendship1;
    @OneToOne(mappedBy = "user2")
    private Friendship friendship2;








}
