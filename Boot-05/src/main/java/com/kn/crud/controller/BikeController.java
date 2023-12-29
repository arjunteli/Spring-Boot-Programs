package com.kn.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kn.crud.entity.Bike;
import com.kn.crud.service.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {

	BikeService bikeService;

	public BikeController(BikeService bikeService) {
		super();
		this.bikeService = bikeService;
	}

	// Create and Store Bike Object
	@PostMapping
	public Bike createBike(@RequestBody Bike bike) throws Exception {
		return bikeService.createBike(bike);
//		if (bikeService.readBikeByRegNumber(bike.getRegNumber()) == null) {
//			return bikeService.createBike(bike);	
//		}else {
//			throw new Exception("Bike Already Exists");
//		}
		
	}

	// Read bike for specific regNumber
	@GetMapping(value = "{regNumber}")
	public Bike readBikeByRegNumber(@PathVariable String regNumber) {
		return bikeService.readBikeByRegNumber(regNumber);
	}

	// Read all the Bikes
	@GetMapping
	public List<Bike> readAllBikes() {
		return bikeService.readAllBikes();

	}

	// Update the Bike
	@PutMapping()
	public Bike updateBike(@RequestBody Bike bike) {
		return bikeService.updateBike(bike);

	}

	// Delete the Bike
	@DeleteMapping("{regNumber}")
	public String deleteBikeByRegNumber(@PathVariable String regNumber) {
		return bikeService.deleteBikeByRegNumber(regNumber) ;

	}
}
