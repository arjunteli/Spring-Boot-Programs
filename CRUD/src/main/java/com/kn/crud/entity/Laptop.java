package com.kn.crud.entity;

public class Laptop {
	private String serialNumber;
	private String manufacturer;
	private double price;

	public Laptop(String serialNumber, String manufacturer, double price) {
		super();
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.price = price;
	}

	public Laptop() {
		super();
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [serialNumber = " + serialNumber + ", manufacturer = " + manufacturer + ", price = " + price + "]";
	}

}
