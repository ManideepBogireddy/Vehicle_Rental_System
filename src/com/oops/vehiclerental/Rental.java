package com.oops.vehiclerental;

public class Rental {
       
	private Customer customer;
	private Vehicle vehicle;
	
	private int numberOfDays;
	
	public Rental(Customer customer, Vehicle vehicle, int numberOfDays) {
		this.customer = customer;
		this.vehicle = vehicle;
		this.numberOfDays = numberOfDays;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
    
    public double calculateTotalRent() {
    	 return vehicle.calculateRent(numberOfDays);
    }
    
    public void displayRentalDetails() {

        System.out.println("===== Rental Details =====");
        
        
        System.out.println("Customer Name:  " +customer.getCustomerName());
        System.out.println("Phone Number:   " +customer.getPhoneNumber());
        
        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("Vehicle Brand : " + vehicle.getBrand());
        System.out.println("Vehicle Model : " + vehicle.getModel());
        System.out.println("Availability  : " + vehicle.isAvailable());

        System.out.println("Rental Days   : " + numberOfDays);
        System.out.println("Total Rent    : " + calculateTotalRent());
    }
    
    public boolean rentVehicle() {

        if (vehicle.isAvailable()) {

            vehicle.setAvailable(false);
            return true;
        }

        return false;
    }
    public void returnVehicle() {

        vehicle.setAvailable(true);
    }
}
