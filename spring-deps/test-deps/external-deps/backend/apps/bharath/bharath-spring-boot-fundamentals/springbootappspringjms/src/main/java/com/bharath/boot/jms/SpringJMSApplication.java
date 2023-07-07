package com.bharath.boot.jms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringJMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJMSApplication.class, args);
	}
}
