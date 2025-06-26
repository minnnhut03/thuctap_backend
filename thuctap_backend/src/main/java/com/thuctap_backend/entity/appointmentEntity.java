package com.thuctap_backend.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Appointments")
@Data @NoArgsConstructor @AllArgsConstructor
public class appointmentEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentID;

    @ManyToOne
    @JoinColumn(name = "patientID")
    private userEntity patient;

    @ManyToOne
    @JoinColumn(name = "doctorID")
    private doctorEntity doctorEntity;

    private LocalDateTime scheduledDate;

    private String status = "PENDING";

    private String symptoms;

    private LocalDateTime createdAt = LocalDateTime.now();

}
