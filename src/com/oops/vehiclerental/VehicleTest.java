package com.oops.vehiclerental;

public class VehicleTest {

	public static void main(String[] args) {
		

	        Vehicle vehicle1 = new Car(
	                101, "TS09AB1234", "Toyota",
	                "Innova", 2500, true, 7
	        );

	        Vehicle vehicle2 = new Bike(
	                201, "TS10XY5678", "Royal Enfield",
	                "Classic 350", 1000, true, 350
	        );

	        Vehicle vehicle3 = new Truck(
	                301, "TS11TR9999", "Tata",
	                "Prima", 3000, true, 5.0
	        );

	        System.out.println("Car Rent   : " + vehicle1.calculateRent(4));
	        System.out.println("Bike Rent  : " + vehicle2.calculateRent(4));
	        System.out.println("Truck Rent : " + vehicle3.calculateRent(4));
	    

	}

}
