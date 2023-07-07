package com.company.javaeightfeatures.comparatorbeforejava8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private String name;
	private Integer age;

}