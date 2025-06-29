package com.thuctap_backend.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap_backend.entity.userEntity;

public interface UserJPA extends JpaRepository<userEntity, Integer> {
	Optional<userEntity> findByEmail(String email);
}
