package com.bharath.document.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Document {
	@Id
	private long id;
	private String name;
	@Lob
	private byte[] data;
}
