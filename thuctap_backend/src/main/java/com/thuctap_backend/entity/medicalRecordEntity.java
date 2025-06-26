package com.thuctap_backend.entity;

import java.time.LocalDateTime;

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
@Table(name = "MedicalRecords")
@Data @NoArgsConstructor @AllArgsConstructor
public class medicalRecordEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer recordID;

	    @OneToOne
	    @JoinColumn(name = "appointmentID")
	    private appointmentEntity appointmentEntity;

	    private String diagnosis;

	    private String prescription;

	    private String notes;

	    private LocalDateTime createdAt = LocalDateTime.now();
}
