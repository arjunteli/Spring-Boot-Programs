package com.kn.fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kn.fullstack.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
