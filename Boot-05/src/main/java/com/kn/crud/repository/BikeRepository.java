package com.kn.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kn.crud.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, String> {

}
