package com.oops.vehiclerental;

public class Vehicle {
	
	private int vehicleId;
	
	private String vehicleNumber;
	
	private String brand;
	
	private String model;
	
	private double rentPerDay;
	
	private boolean available;
	
	public Vehicle(int vehicleId, String vehicleNumber, String brand, String model, double rentPerDay, boolean available ) {
		
		this.vehicleId = vehicleId;
		
		this.vehicleNumber = vehicleNumber;
		
		this.brand = brand;
		
		this.model = model;
		
		this.rentPerDay = rentPerDay;
		
		this.available = available;
		
	}
	
	public void setVehicleId(int vechicleId) {
		this.vehicleId = vechicleId;
	}
	
	public int getVehicleId() {
		return vehicleId;
	}
	
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void displayVehicleDetails() {

	    System.out.println("Vehicle ID      : " + vehicleId);
	    System.out.println("Vehicle Number  : " + vehicleNumber);
	    System.out.println("Brand           : " + brand);
	    System.out.println("Model           : " + model);
	    System.out.println("Rent Per Day    : " + rentPerDay);
	    System.out.println("Available       : " + available);
	}
	
	public double calculateRent(int numberOfDays) {
	    return rentPerDay * numberOfDays;
	}

}
