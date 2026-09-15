package com.oops.vehiclerental;

public class RentalTest {

	public static void main(String[] args) {
        Customer customer = new Customer(
                501,
                "Mani",
                "9876543210",
                "DL123456789"
        );

        Vehicle vehicle = new Car(
                101,
                "TS09AB1234",
                "Toyota",
                "Innova",
                2500,
                true,
                7
        );

        Rental rental = new Rental(customer, vehicle, 4);

        System.out.println("Before Rental: " + vehicle.isAvailable());

        boolean rented = rental.rentVehicle();

        System.out.println("Rental Successful: " + rented);
        System.out.println("After Rental: " + vehicle.isAvailable());

        rental.returnVehicle();

        System.out.println("After Return: " + vehicle.isAvailable());

	}

}
