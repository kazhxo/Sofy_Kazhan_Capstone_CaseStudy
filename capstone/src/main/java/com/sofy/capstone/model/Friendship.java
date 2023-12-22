package com.sofy.capstone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Friendship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long friendshipId;

    @OneToOne
    private User user1;
    @OneToOne
    private User user2;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FriendshipStatus status;

    @Column(nullable = false)
    private LocalDateTime timestmap;



}
