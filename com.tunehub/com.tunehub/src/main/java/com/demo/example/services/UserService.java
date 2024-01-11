package com.demo.example.services;

import com.demo.example.entities.Users;

public interface UserService {
 String addUsers(Users user);

boolean emailExists(String email);

boolean validateUsers(String email, String password);

String getRole(String email);

Users getUser(String email);

void updateUser(Users user);
}
