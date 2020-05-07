package com.bmpl.CarRental.controller;

import com.bmpl.CarRental.model.BookingStatus;
import com.bmpl.CarRental.model.Car;

public class CarOperations {
	
	//CRUD
	//Add a car
	//Show available cars
	//Show details
	//Update car
	//Delete car
	
	/**
	 * Add a new car to the fleet
	 * @param vehicleNumber
	 * @param model
	 * @param seatingCapacity
	 * @param rentPerDay
	 * @return message based on addition of car to the fleet 
	 */
	public String addNewCar(String vehicleNumber, String model, int seatingCapacity, int rentPerDay) {
		if(Car.getCars().add(new Car(vehicleNumber, model, seatingCapacity, rentPerDay)))
			return "Car Added Successfully...";
		return "Car couldn't be added...";
	}
	
	public int getCarIndex(String vehicleNumber) {
		for(int i=0; i < Car.getCars().size(); i++) {
			Car car = Car.getCars().get(i);
			if(vehicleNumber == car.getVehicleNumber()) return i;
		}
		return -1;
	}
	
	/**
	 * Delete a car only if it doesn't have any bookings
	 * @param vehicleNumber
	 * @return message based on successful deletion of the car
	 */
	public String deleteCar(String vehicleNumber) {
		int carIndex = getCarIndex(vehicleNumber);
		if(carIndex >= 0) {
			Car.getCars().remove(carIndex);
			return "Car Deleted Successfully...";
		}
		return "Car couldn't be deleted...";
	}
	
	/**
	 * Car details are returned if car having vehicleNumber is found
	 * @param vehicleNumber
	 * @return car details as a String
	 */
	public String getDetails(String vehicleNumber) {
		int carIndex = getCarIndex(vehicleNumber);
		Car car = Car.getCars().get(carIndex);
		String details = "";
		
		details += "Vehicle number : " + vehicleNumber + "\n";
		details += "Model : " + car.getModel() + "\n";
		details += "Seating Capacity : " + car.getSeatingCapacity() + "\n";
		details += "Rent per day : " + car.getRentPerDay() + "\n";
		
		for(int i = 0; i < car.getBookings().size(); i++) {
			BookingStatus booking = car.getBookings().get(i);
			details += "\nBooking " + (i+1) + "\n";
			details += "Customer name : " + booking.getCustomerName() + "\n";
			details += "Customer phone no : " + booking.getCustomerPhoneNo() + "\n";
			details += "Issue date : " + booking.getIssueDate() + "\n";
			details += "Return date : " + booking.getReturnDate() + "\n";
		}
		
		return details;
	}
	
}
