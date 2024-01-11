package com.kn.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kn.fullstack.service.StudentService;

//@RestController
//@RequestMapping("/student")

@Controller
public class StudentController {
	@Autowired
	StudentService service;

	@GetMapping("/student-crud")
	String getAllStudents(Model model) {
		model.addAttribute("students", service.getAllStudents());

		return "view-student";
	}
}
