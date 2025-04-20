package com.example.demo.controller;
import com.example.demo.model.Student;
import com.example.demo.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller

public class studentController {
    @Autowired
    private studentRepository studentRepo;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("students", studentRepo.findAll());
        return "view-students";
    }

    @GetMapping("/add")
    public String addStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentRepo.save(student);
        return "redirect:/";
    }
}
