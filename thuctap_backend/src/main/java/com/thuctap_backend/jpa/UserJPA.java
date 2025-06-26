package com.thuctap_backend.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap_backend.entity.userEntity;

public interface UserJPA extends JpaRepository<userEntity, Integer> {

}
