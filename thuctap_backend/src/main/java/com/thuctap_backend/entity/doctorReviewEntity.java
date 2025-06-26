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
@Table(name = "DoctorReviews")
@Data @NoArgsConstructor @AllArgsConstructor
public class doctorReviewEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewID;

    @ManyToOne
    @JoinColumn(name = "patientID")
    private userEntity userEntity;

    @ManyToOne
    @JoinColumn(name = "doctorID")
    private doctorEntity doctorEntity;

    @Column(nullable = false)
    private Integer rating;

    private String comment;

    private LocalDateTime reviewedAt = LocalDateTime.now();
}
