package com.company.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pincode;
	@Column(length = 30, nullable = false)
	private String city;
	private String state;
	private String country;
}
