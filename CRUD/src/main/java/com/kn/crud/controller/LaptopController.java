package com.kn.crud.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kn.crud.entity.Laptop;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	
	Laptop laptop = new Laptop("HP - 204", "HP", 45678);
	@GetMapping("{serialNumber}")
	public Laptop getLaptop(@PathVariable String serialNumber) {
		return laptop;
		
	}
	
	@PostMapping
	public String createLaptop(@RequestBody Laptop laptop) {
		this.laptop = laptop;
		return laptop.toString().concat(" has been added successfully!!!!!!1");
	}
	@PutMapping(value = "/update")
	public String updateLaptop(@RequestBody Laptop laptop) {
		Laptop old = this.laptop;
		this.laptop = laptop;
		
		return old.toString() + " has been updated to "+ laptop.toString();
	}
	
	@DeleteMapping("delete")
	public String deleteLaptop() {
		Laptop temp = this.laptop;
		laptop = null;
		return temp.toString()+"has been deleted successfully!!!!!";
		
	}
}
