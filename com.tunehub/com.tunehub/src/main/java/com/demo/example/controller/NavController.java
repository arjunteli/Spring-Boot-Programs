package com.demo.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	@GetMapping("/registerform")
	public String registerPage() {
		return "register";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@GetMapping("/newSong")
	public String newSong() {
		return "newSong";
	}
}
