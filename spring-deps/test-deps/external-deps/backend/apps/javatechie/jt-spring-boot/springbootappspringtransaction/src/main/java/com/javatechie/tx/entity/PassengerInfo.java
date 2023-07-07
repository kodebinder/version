package com.javatechie.tx.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PASSENGER_INFOS")
public class PassengerInfo {
    @Id
    @GeneratedValue
    private Long pId;
    private String name;
    private String email;
    private String source;
    private String Destination;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date travelDate;
    private String pickupTime;
    private String arrivalTime;
    private double fare;
}
