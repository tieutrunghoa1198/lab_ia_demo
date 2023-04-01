package com.example.lab_ia.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student", schema = "lab_ia_assignment")
public class Student {
    @Id
    @Column(name = "idStudent", nullable = false, length = 50)
    private String id;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "address", nullable = false, length = 150)
    private String address;

    @Column(name = "gender", nullable = false)
    private Boolean gender = false;

}