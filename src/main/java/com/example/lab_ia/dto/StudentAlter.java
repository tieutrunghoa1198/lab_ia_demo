package com.example.lab_ia.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student_alter", schema = "lab_ia_assignment")
public class StudentAlter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "student_name", nullable = false)
    private String studentName;

    @Column(name = "student_code", nullable = false)
    private String studentCode;

    @Column(name = "address")
    private String address;

    @Column(name = "gender")
    private Boolean gender;

}