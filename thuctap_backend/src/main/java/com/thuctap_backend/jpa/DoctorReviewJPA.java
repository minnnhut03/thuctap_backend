package com.thuctap_backend.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap_backend.entity.doctorEntity;

public interface DoctorReviewJPA extends JpaRepository<doctorEntity, Integer> {

}
