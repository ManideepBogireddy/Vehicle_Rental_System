package com.oops.vehiclerental;

public class Customer {

	private int customerId;

	private String customerName;

	private String phoneNumber;

	private String drivingLicense;

	public Customer(int customerId, String customerName, String phoneNumber, String drivingLicense) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.drivingLicense = drivingLicense;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}

	public void displayCustomerDetails() {
		System.out.println("Customer ID       : " + customerId);
		System.out.println("Customer Name     : " + customerName);
		System.out.println("Phone Number      : " + phoneNumber);
		System.out.println("Driving License   : " + drivingLicense);
	}

}
