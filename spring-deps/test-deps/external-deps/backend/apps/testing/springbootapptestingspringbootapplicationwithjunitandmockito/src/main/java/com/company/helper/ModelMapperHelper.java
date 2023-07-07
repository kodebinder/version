package com.company.helper;

import com.company.dto.EmployeeDto;
import com.company.entity.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperHelper {

    private final ModelMapper modelMapper;

    public ModelMapperHelper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Employee mapDtoToEntity(EmployeeDto employeeDto) {
        return modelMapper.map(employeeDto, Employee.class);
    }

    public EmployeeDto mapEntityToDto(Employee employee) {
        return modelMapper.map(employee, EmployeeDto.class);
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
