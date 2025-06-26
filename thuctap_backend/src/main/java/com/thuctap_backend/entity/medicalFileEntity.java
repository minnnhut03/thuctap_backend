package com.thuctap_backend.entity;

import java.time.LocalDateTime;

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
@Table(name = "MedicalFiles")
@Data @NoArgsConstructor @AllArgsConstructor
public class medicalFileEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer fileID;

	    @ManyToOne
	    @JoinColumn(name = "recordID")
	    private medicalRecordEntity medicalRecordEntity;

	    private String fileName;

	    private String filePath;

	    private LocalDateTime uploadedAt = LocalDateTime.now();
}
