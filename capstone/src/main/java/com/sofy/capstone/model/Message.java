package com.sofy.capstone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long messageId;

    @ManyToOne
    private User sender;
    @ManyToOne
    private User recipient;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)

    private LocalDateTime timestamp;

}
