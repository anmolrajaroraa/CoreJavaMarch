package com.bmpl.CarRental.controller;

import java.time.LocalDate;
import java.util.ArrayList;

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
	
	// A function returning the index of car based on its number plate
	private Car getCar(String vehicleNumber) {
		for(Car car : Car.getCars()) {
			if(car.getVehicleNumber().equals(vehicleNumber)) return car;
		}
		return null;
	}
	
	/**
	 * Delete a car only if it doesn't have any bookings
	 * @param vehicleNumber
	 * @return message based on successful deletion of the car
	 */
	public String deleteCar(String vehicleNumber) {
		Car car = getCar(vehicleNumber);
		if(car != null) {
			Car.getCars().remove(car);
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
		Car car = getCar(vehicleNumber);
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
	
	// A function to verify that issue date and return date are valid and are available for booking
	private boolean verifyBookingDates(LocalDate newIssueDate, LocalDate newReturnDate, 
			ArrayList<BookingStatus> bookings) {
		
		if(newReturnDate.compareTo(newIssueDate) < 0 || newIssueDate.compareTo(LocalDate.now()) < 0) {
			return false;
		}
		
		for(BookingStatus booking : bookings) {
			if(booking.getIssueDate().compareTo(newIssueDate) >= 0 && 
					booking.getIssueDate().compareTo(newReturnDate) <= 0) {
				return false;
			}
			if(booking.getReturnDate().compareTo(newIssueDate) >= 0 && 
					booking.getReturnDate().compareTo(newReturnDate) <= 0) {
				return false;
			}
		}
		
		return true;		
	}
	
	/**
	 * This method is used to book a car for some specific dates
	 * @param vehicleNumber
	 * @param customerName
	 * @param customerPhoneNo
	 * @param issueDate
	 * @param returnDate
	 * @return message based on successful booking
	 */
	public String bookCar(String vehicleNumber, String customerName, String customerPhoneNo, String issueDate, String returnDate) {
		Car car = getCar(vehicleNumber);
		LocalDate newIssueDate = LocalDate.parse(issueDate);
		LocalDate newReturnDate = LocalDate.parse(returnDate);
		
		if(verifyBookingDates(newIssueDate, newReturnDate, car.getBookings())) {
			BookingStatus booking = new BookingStatus(customerName, Long.valueOf(customerPhoneNo), newIssueDate, newReturnDate);
			car.getBookings().add(booking);
			return "Booking Done for " + customerName + " from " + issueDate + " to " + returnDate;
		}
		return "Booking cannot be made from " + issueDate + " to " + returnDate;
	}
	
	public String showCarsAvailableForBooking(String issueDate, String returnDate) {
		String result = "Available Cars\n";
		LocalDate newIssueDate = LocalDate.parse(issueDate);
		LocalDate newReturnDate = LocalDate.parse(returnDate);
		
		for(Car car : Car.getCars()) {
			if(verifyBookingDates(newIssueDate, newReturnDate, car.getBookings())) {
				result += "Vehicle number : " + car.getVehicleNumber() + ", ";
				result += "Car model : " + car.getModel() + "\n";
			}
		}
		return result;
	}
	
}
