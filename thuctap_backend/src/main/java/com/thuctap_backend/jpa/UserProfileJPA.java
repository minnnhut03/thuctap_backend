package com.thuctap_backend.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap_backend.entity.userProfileEntity;

public interface UserProfileJPA extends JpaRepository<userProfileEntity, Integer> {

}
