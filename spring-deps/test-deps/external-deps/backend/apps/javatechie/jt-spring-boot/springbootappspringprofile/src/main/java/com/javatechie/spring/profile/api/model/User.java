package com.javatechie.spring.profile.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	@Id
	private int id;
	private String name;
}
