package com.kn.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kn.fullstack.entity.Student;
import com.kn.fullstack.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository repo;

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
