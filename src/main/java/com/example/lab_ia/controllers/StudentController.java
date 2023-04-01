package com.example.lab_ia.controllers;

import com.example.lab_ia.dto.repository.StudentAlterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @Autowired
    StudentAlterRepository studentRepository;
    @GetMapping("/students")
    public String student(Model model) {
        var listStu = studentRepository.findAll();
        for (var element: listStu) {
            System.out.println(element.getGender());
        }
        model.addAttribute("listStu", listStu);
        return "student/student";
    }
}
