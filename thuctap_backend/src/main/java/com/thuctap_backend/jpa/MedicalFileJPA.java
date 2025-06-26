package com.thuctap_backend.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap_backend.entity.medicalFileEntity;

public interface MedicalFileJPA extends JpaRepository<medicalFileEntity, Integer> {

}
