package com.company.findNthsalaryofEmployee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    private int empId;
    private String empName;
    private double salary;
}
