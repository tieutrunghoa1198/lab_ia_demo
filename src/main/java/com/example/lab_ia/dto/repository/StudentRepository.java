package com.example.lab_ia.dto.repository;

import com.example.lab_ia.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
}