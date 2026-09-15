package com.oops.vehiclerental;

public class Bike extends Vehicle{
	
	@Override
	public double calculateRent(int numberOfDays) {
		double baseRent = getRentPerDay() * numberOfDays;
		double serviceCharge = baseRent * 0.05;
		return baseRent + serviceCharge;
	}

	private int engineCC;
	
	public Bike(int vehicleId, String vehicleNumber, String brand, String model, double rentPerDay, boolean available , int engineCC) {
		super(vehicleId,vehicleNumber, brand, model, rentPerDay,available);
		this.engineCC = engineCC;	
		}


    public void setEngineCC(int engineCC) {
    	this.engineCC = engineCC;
    }
    
    public int getEngineCC() {
    	return engineCC;
    }
    
    
    }