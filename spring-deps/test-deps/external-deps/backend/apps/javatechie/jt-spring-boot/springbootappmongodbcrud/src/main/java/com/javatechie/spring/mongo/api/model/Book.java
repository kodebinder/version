package com.javatechie.spring.mongo.api.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bookName;
	private String authorName;
}
