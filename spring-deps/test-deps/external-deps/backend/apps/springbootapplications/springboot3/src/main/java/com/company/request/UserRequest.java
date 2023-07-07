package com.company.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {

    @NotNull(message = "name cannot be null")
    private String name;

    @Email(message = "email address is invalid")
    @Size(min = 10, max = 50, message = "email size should be between 10 and 50")
    private String email;
    
    @Pattern(regexp = "^\\d{10}$", message = "mobile number is invalid. should be 10 digit maximum")
    private String mobile;

    @NotBlank
    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String nationality;
}
