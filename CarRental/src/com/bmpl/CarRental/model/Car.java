package com.bmpl.CarRental.model;

import java.util.ArrayList;
import java.util.Date;

public class Car {
	
	static ArrayList<Car> cars = new ArrayList<>();

	String vehicleNumber;
	String model;
	int seatingCapacity;
	int rentPerDay;
	BookingStatus bs;
	
	static void addNewCar(Car car) {
		cars.add(car);
	}
	
	String bookCar(String customerName, long customerPhoneNo, Date issueDate, Date returnDate ) {
			if(bs.isBooked()) {
				return "Car not available for rent!";
			}
			else {
				bs.setBooked(true);
				bs.setCustomerName(customerName);
				bs.setCustomerPhoneNo(customerPhoneNo);
				bs.setIssueDate(issueDate);
				bs.setReturnDate(returnDate);
				return "Car Booked!!";
			}
	}
	
}
