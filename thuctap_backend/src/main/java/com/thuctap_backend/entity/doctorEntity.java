package com.thuctap_backend.entity;

import org.apache.catalina.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Doctors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class doctorEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doctorID;

    @OneToOne
    @JoinColumn(name = "userID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "departmentID")
    private departmentEntity departmentEntity;

    private String qualifications;

    private Integer experienceYears;
}
