package com.thuctap_backend.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap_backend.entity.medicalRecordEntity;

public interface MedicalRecordJPA extends JpaRepository<medicalRecordEntity, Integer> {

}
