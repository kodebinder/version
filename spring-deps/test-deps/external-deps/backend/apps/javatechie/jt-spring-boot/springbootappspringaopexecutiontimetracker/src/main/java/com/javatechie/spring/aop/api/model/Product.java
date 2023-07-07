package com.javatechie.spring.aop.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
	@Id
	private int id;
	private String name;
	private double price;

}
