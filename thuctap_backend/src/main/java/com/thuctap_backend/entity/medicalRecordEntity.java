package com.thuctap_backend.entity;

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
@Table(name = "MedicalRecords")
@Data @NoArgsConstructor @AllArgsConstructor
public class medicalRecordEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer recordID;

	    @OneToOne
	    @JoinColumn(name = "appointmentID")
	    private Appointment appointment;

	    private String diagnosis;

	    private String prescription;

	    private String notes;

	    private LocalDateTime createdAt = LocalDateTime.now();
}
