package com.oops.vehiclerental;

public class Truck extends Vehicle{
	
	
	public double calculateRent(int numberOfDays) {
		double baseRent = getRentPerDay() * numberOfDays;
		double serviceCharge = baseRent * 0.15 ;
		return baseRent + serviceCharge;
	}
	
	private double loadCapacity;
	
	public Truck(int vehicleId, String vehicleNumber, String brand, String model, double rentPerDay, boolean available, double loadCapacity) {
		super(vehicleId,vehicleNumber, brand, model, rentPerDay,available);
		this.loadCapacity = loadCapacity;
		
	}
	public void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	
	public double getLoadCapacity() {
		return loadCapacity;
	}

}
