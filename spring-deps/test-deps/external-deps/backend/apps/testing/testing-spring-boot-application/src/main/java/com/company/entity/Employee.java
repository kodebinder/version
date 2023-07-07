package com.company.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private Double salary;
	private String department;
	private String phone;
	private Date dob;
	private boolean isActive;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Embedded
	private Address address;

}
