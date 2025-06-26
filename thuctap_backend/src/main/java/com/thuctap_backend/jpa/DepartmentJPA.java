package com.thuctap_backend.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap_backend.entity.departmentEntity;

public interface DepartmentJPA extends JpaRepository<departmentEntity, Integer> {

}
