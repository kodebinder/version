package com.bharath.spring.springorm.product.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String desc;
	@Column(name = "price")
	private double price;
}
