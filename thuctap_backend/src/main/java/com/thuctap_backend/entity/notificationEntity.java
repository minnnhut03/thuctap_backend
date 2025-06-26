package com.thuctap_backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Notifications")
@Data @NoArgsConstructor @AllArgsConstructor
public class notificationEntity {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer notificationID;

	    @ManyToOne
	    @JoinColumn(name = "userID")
	    private userEntity userEntity;

	    private String message;

	    private boolean isRead = false;

	    private LocalDateTime sentAt = LocalDateTime.now();
}
