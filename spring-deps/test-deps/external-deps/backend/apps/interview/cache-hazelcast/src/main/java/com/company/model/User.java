package com.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -6912201477750422475L;

    @Id
    private int id;
    private String name;
    private String address;
}