package com.oops.vehiclerental;

public class Car extends Vehicle{
	
	@Override
	public double calculateRent(int numberOfDays) {
		double baseRent = getRentPerDay() * numberOfDays;
		double serviceCharges = baseRent * 0.10;
	    return baseRent + serviceCharges;
	}
	
	private int numberOfSeats;
	
	public Car(int vehicleId, String vehicleNumber, String brand, String model, double rentPerDay, boolean available,int numberOfSeats) {
		super(vehicleId,vehicleNumber, brand, model, rentPerDay,available);
		this.numberOfSeats = numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
}
