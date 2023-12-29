package com.kn.fullstack.service;

import org.springframework.stereotype.Service;

@Service
public class PercentageCalculatorService {

	public String calculatePercentage(String name, int sub1, int sub2, int sub3, int sub4, int sub5) {
		double percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
		return "Hey " + name + ", your percentage = " + percentage;
	}

}
