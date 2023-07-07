package com.javatechie.spring.mockito.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String dept;
}
