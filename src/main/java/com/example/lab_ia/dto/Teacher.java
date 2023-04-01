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
@Table(name = "teacher", schema = "lab_ia_assignment")
public class Teacher {
    @Id
    @Column(name = "teacherId", nullable = false, length = 150)
    private String id;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "departmentId", nullable = false)
    private Integer departmentId;

}