package com.kn.fullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kn.fullstack.service.PercentageCalculatorService;

@RestController
@RequestMapping("/data")
public class FullStackController {

	@Autowired
	PercentageCalculatorService service;

	@PostMapping
	public String getData(@RequestParam String name, @RequestParam int sub1, @RequestParam int sub2,
			@RequestParam int sub3, @RequestParam int sub4, @RequestParam int sub5) {
//		double percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
//		return "Hey " + name + ", your percentage = " + percentage;
		return service.calculatePercentage(name, sub1, sub2, sub3, sub4, sub5);
	}
}
