package com.example.lab_ia.dto.repository;

import com.example.lab_ia.dto.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
}