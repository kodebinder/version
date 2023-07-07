package com.javatechie.spring.validate.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	@NotNull
	@Size(min = 2, max = 10, message = "length shoud be in between 2 to 10")
	private String name;

	@NotEmpty(message = "Email field should not be empty")
	@Email(regexp = "^(.+)@(.+)$", message = "Invalid email pattern")
	private String email;

	@Pattern(regexp = "[7-9][0-9]{9}", message = "invalid mobile number.")
	@Size(max = 10, message = "digits should be 10")
	private String mobile;
}