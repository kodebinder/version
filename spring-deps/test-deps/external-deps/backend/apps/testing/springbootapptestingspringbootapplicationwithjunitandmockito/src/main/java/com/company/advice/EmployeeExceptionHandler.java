package com.company.advice;

import com.company.exception.EmployeeNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
@Slf4j
public class EmployeeExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleInvalidArgument(MethodArgumentNotValidException methodArgumentNotValidException) {
        Map<String, String> errorMap = new HashMap<>();
        methodArgumentNotValidException.getBindingResult().getFieldErrors().forEach(
                error -> {
                    errorMap.put(error.getField(), error.getDefaultMessage());
                });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(EmployeeNotFoundException.class)
    public Map<String, String> handleEmployeeNotFoundException(EmployeeNotFoundException employeeNotFoundException) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("employeeNotFoundException", employeeNotFoundException.getMessage());
        return errorMap;
    }
}
