package com.kn.crud.entity;

public class Mobile {
	private String iMEINumber;
	private String model;
	private double cost;

	public Mobile(String iMEINumber, String model, double cost) {
		super();
		this.iMEINumber = iMEINumber;
		this.model = model;
		this.cost = cost;
	}

	public Mobile() {
		super();
	}

	public String getiMEINumber() {
		return iMEINumber;
	}

	public void setiMEINumber(String iMEINumber) {
		this.iMEINumber = iMEINumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Mobile [iMEINumber=" + iMEINumber + ", model=" + model + ", cost=" + cost + "]";
	}

}
