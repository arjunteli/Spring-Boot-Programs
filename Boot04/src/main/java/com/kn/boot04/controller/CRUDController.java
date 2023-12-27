package com.kn.boot04.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kn.boot04.entity.Student;

@RestController
@RequestMapping("/crud")
public class CRUDController {

	@GetMapping("{id}")
	public List<Student> getStuden(@PathVariable int id) {
		Student s1 = new Student(id, 99, "Monisha");
		Student s2 = new Student(id+1, 99, "Monisha");
		Student s3 = new Student(id+2, 99, "Monisha");
		Student s4 = new Student(id+3, 99, "Monisha");
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		return list;
	}
}
