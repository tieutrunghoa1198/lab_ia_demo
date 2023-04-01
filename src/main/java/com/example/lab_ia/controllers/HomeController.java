package com.example.lab_ia.controllers;

import com.example.lab_ia.dto.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private int count;
    @Autowired
    AccountRepository accrepo;
    @GetMapping("/")
    public String index(Model model) {
        var listAcc = accrepo.findAll();
        model.addAttribute("listAcc", listAcc);
        return "index";
    }

    public void increaseCount() {
        this.count++;
    }
}
