package com.thuctap_backend.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thuctap_backend.entity.notificationEntity;

public interface NotificationJPA extends JpaRepository<notificationEntity, Integer> {

}
