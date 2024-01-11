package com.demo.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.entities.Users;
import com.demo.example.repositories.UserRepositories;
@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepositories repo;
	
	@Override
	public String addUsers(Users user) {
		repo.save(user);
		return "User Added Successfully";
	}

	@Override
	public boolean emailExists(String email) {
		if(repo.findByEmail(email)==null) {
			return false;
		}
		return true;
	}

	@Override
	public boolean validateUsers(String email, String password) {
		if(repo.findByEmail(email)==null) {
			return false;
		}
		else {
		Users user=repo.findByEmail(email);
		String db_pass=user.getPassword();
		if(password.equals(db_pass)) {
			return true;
		}
		else {
		return false;
	}
		}
		}

	@Override
	public String getRole(String email) {
		Users user=repo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public Users getUser(String email) {
		
		return repo.findByEmail(email);
	}

	@Override
	public void updateUser(Users user) {
		repo.save(user);
		
	}

}
