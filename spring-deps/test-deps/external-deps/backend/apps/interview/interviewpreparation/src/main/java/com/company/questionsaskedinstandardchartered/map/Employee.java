package com.company.questionsaskedinstandardchartered.map;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    private long id;
    private String name;
    private double salary;
}
