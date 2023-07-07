package com.javatechie.spring.scheduler.api.model;

import lombok.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
}
