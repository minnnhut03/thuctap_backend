package com.thuctap_backend.entity;


import java.time.LocalDate;

import org.apache.catalina.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UserProfiles")
@Data @NoArgsConstructor @AllArgsConstructor
public class userProfileEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer profileID;

	    @OneToOne
	    @JoinColumn(name = "userID")
	    private User user;

	    private LocalDate dateOfBirth;

	    private String gender;

	    private String address;

	    private String insuranceNumber;

	    private String bloodType;

	    private String allergies;
}
