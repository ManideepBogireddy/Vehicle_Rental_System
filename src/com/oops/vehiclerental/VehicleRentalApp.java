package com.oops.vehiclerental;

import java.util.Scanner;

public class VehicleRentalApp {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static Customer customer;
	private static Vehicle vehicle;
	private static Rental rental;
	
	public static Customer registerCustomer() {

	    System.out.print("Enter Customer ID: ");
	    int customerId = scanner.nextInt();
	    scanner.nextLine();

	    System.out.print("Enter Customer Name: ");
	    String customerName = scanner.nextLine();

	    System.out.print("Enter Phone Number: ");
	    String phoneNumber = scanner.nextLine();

	    System.out.print("Enter Driving License: ");
	    String drivingLicense = scanner.nextLine();

	    Customer customer = new Customer(
	            customerId,
	            customerName,
	            phoneNumber,
	            drivingLicense
	    );

	    System.out.println("Customer registered successfully!");

	    return customer;
	}
	
	public static Vehicle addVehicle() {

	    System.out.println("Select Vehicle Type:");
	    System.out.println("1. Car");
	    System.out.println("2. Bike");
	    System.out.println("3. Truck");

	    System.out.print("Enter choice: ");
	    int choice = scanner.nextInt();
	    scanner.nextLine();

	    System.out.print("Enter Vehicle ID: ");
	    int vehicleId = scanner.nextInt();
	    scanner.nextLine();

	    System.out.print("Enter Vehicle Number: ");
	    String vehicleNumber = scanner.nextLine();

	    System.out.print("Enter Brand: ");
	    String brand = scanner.nextLine();

	    System.out.print("Enter Model: ");
	    String model = scanner.nextLine();

	    System.out.print("Enter Rent Per Day: ");
	    double rentPerDay = scanner.nextDouble();

	    boolean available = true;

	    if (choice == 1) {

	        System.out.print("Enter Number of Seats: ");
	        int numberOfSeats = scanner.nextInt();

	        return new Car(
	                vehicleId,
	                vehicleNumber,
	                brand,
	                model,
	                rentPerDay,
	                available,
	                numberOfSeats
	        );

	    } else if (choice == 2) {

	        System.out.print("Enter Engine CC: ");
	        int engineCC = scanner.nextInt();

	        return new Bike(
	                vehicleId,
	                vehicleNumber,
	                brand,
	                model,
	                rentPerDay,
	                available,
	                engineCC
	        );

	    } else if (choice == 3) {

	        System.out.print("Enter Load Capacity: ");
	        double loadCapacity = scanner.nextDouble();

	        return new Truck(
	                vehicleId,
	                vehicleNumber,
	                brand,
	                model,
	                rentPerDay,
	                available,
	                loadCapacity
	        );

	    } else {

	        System.out.println("Invalid vehicle type!");
	        return null;
	    }
	}

	public static void main(String[] args) {
		
		 
		 while(true) {
		 
		 System.out.println("===== Vehicle Rental System =====");
		 System.out.println("1. Add Vehicle");
		 System.out.println("2. Register Customer");
		 System.out.println("3. View Vehicles");
		 System.out.println("4. Rent Vehicle");
		 System.out.println("5. Return Vehicle");
		 System.out.println("6. Calculate Rent");
		 System.out.println("7. View Rental Details");
		 System.out.println("8. Exit");

		 System.out.print("Enter your choice: ");
		 int choice = scanner.nextInt();
		 

		 switch (choice) {
		 
		 

		    case 1:
		        System.out.println("Add Vehicle selected");
		        vehicle = addVehicle();
		        break;

		    case 2:
		        System.out.println("Register Customer selected");
		        customer = registerCustomer();
		        break;

		    case 3:
		        System.out.println("View Vehicles selected");
		        if (vehicle == null) {
		            System.out.println("No vehicle found!");
		            break;
		        }

		        vehicle.displayVehicleDetails();
		        break;

		    case 4:
		        System.out.println("Rent Vehicle selected");
		        if (customer == null) {
		            System.out.println("Please register a customer first!");
		            break;
		        }

		        if (vehicle == null) {
		            System.out.println("Please add a vehicle first!");
		            break;
		        }

		        System.out.print("Enter number of rental days: ");
		        int numberOfDays = scanner.nextInt();

		        rental = new Rental(customer, vehicle, numberOfDays);

		        if (rental.rentVehicle()) {
		            System.out.println("Vehicle rented successfully!");
		        } else {
		            System.out.println("Vehicle is not available!");
		        }

		        break;

		    case 5:
		        System.out.println("Return Vehicle selected");

		        if (vehicle == null) {
		            System.out.println("No vehicle found!");
		            break;
		        }

		        Rental rental1 = new Rental(customer, vehicle, 0);

		        rental1.returnVehicle();

		        System.out.println("Vehicle returned successfully!");
		        break;

		    case 6:
		        System.out.println("Calculate Rent selected");
		        if (customer == null) {
		            System.out.println("Please register a customer first!");
		            break;
		        }

		        if (vehicle == null) {
		            System.out.println("Please add a vehicle first!");
		            break;
		        }

		        System.out.print("Enter number of rental days: ");
		        int numberOfDays1 = scanner.nextInt();

		        Rental rental2  = new Rental(customer, vehicle, numberOfDays1);

		        System.out.println("Total Rent: " + rental2.calculateTotalRent());
		        break;

		    case 7:
		        System.out.println("View Rental Details selected");
		        if (rental == null) {
		            System.out.println("No rental found!");
		            break;
		        }

		        rental.displayRentalDetails();
		        break;

		    case 8:
		    	System.out.println("Thank you for using Vehicle Rental System!");
		        scanner.close();
		        return;

		    default:
		        System.out.println("Invalid choice!");
		}

	}
	}

}
