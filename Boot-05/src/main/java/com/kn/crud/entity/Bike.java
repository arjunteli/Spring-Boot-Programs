package com.kn.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {

	@Id
	private String regNumber;
	private String manufacturer;
	private String model;

	public Bike(String regNumber, String manufacturer, String model) {
		super();
		this.regNumber = regNumber;
		this.manufacturer = manufacturer;
		this.model = model;
	}

	public Bike() {
		super();
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", manufacturer=" + manufacturer + ", model=" + model + "]";
	}

}
