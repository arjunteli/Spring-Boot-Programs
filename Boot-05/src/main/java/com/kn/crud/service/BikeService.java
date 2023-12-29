package com.kn.crud.service;

import java.util.List;

import com.kn.crud.entity.Bike;

public interface BikeService {

	// Create and Store Bike Object
	Bike createBike(Bike bike);

	// Read bike for specific regNumber
	Bike readBikeByRegNumber(String regNumber);

	// Read all the Bikes
	List<Bike> readAllBikes();

	// Update the Bike
	Bike updateBike(Bike bike);

	// Delete the Bike
	String deleteBikeByRegNumber(String regNumber);

}
