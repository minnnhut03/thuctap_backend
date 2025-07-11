package com.thuctap_backend.entity;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Users")
@Data @NoArgsConstructor @AllArgsConstructor
public class userEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userID;

    private String fullName;

    @Column(unique = true)
    private String email;

    private String passwordHash;

    private String phoneNumber;

    private String role = "PATIENT";

    private LocalDateTime createdAt = LocalDateTime.now();

}
