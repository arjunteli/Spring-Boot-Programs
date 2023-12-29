package com.kn.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kn.crud.entity.Bike;
import com.kn.crud.repository.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService {

	BikeRepository bikeRepository;

	public BikeServiceImpl(BikeRepository bikeRepository) {
		super();
		this.bikeRepository = bikeRepository;
	}

	@Override
	public Bike createBike(Bike bike) {
		return bikeRepository.save(bike);
	}

	@Override
	public Bike readBikeByRegNumber(String regNumber) {
		return	bikeRepository.findById(regNumber).get();
	}

	@Override
	public List<Bike> readAllBikes() {
		return bikeRepository.findAll();
	}

	@Override
	public Bike updateBike(Bike bike) {
		return bikeRepository.save(bike);
	}

	@Override
	public String deleteBikeByRegNumber(String regNumber) {
		 bikeRepository.deleteById(regNumber);
		 return "Bike Deleted";
	}

}
