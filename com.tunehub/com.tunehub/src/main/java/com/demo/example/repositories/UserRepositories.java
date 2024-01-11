package com.demo.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.entities.Users;

public interface UserRepositories  extends JpaRepository<Users, Integer>{

	public Users findByEmail(String email);

}
