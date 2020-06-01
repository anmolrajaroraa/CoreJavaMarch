package com.bmpl.CarRental.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car {
	
	static ArrayList<Car> cars = new ArrayList<>();

	private String vehicleNumber;
	private String model;
	private byte seatingCapacity;
	private short rentPerDay;
	private ArrayList<BookingStatus> bookings = new ArrayList<>();
	
	public byte getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(byte seatingCapacity) {
//		if(bookings.size() == 0) {
		this.seatingCapacity = seatingCapacity;
//		}
	}

	public short getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(short rentPerDay) {
//		if(bookings.size() == 0) {
		this.rentPerDay = rentPerDay;
//		}
	}

	public static ArrayList<Car> getCars() {
		return cars;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public String getModel() {
		return model;
	}

	public ArrayList<BookingStatus> getBookings() {
		return bookings;
	}

	public void setBookings(ArrayList<BookingStatus> bookings) {
		this.bookings = bookings;
	}

	public Car(String vehicleNumber, String model, int seatingCapacity, int rentPerDay) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.seatingCapacity = (byte)seatingCapacity;
		this.rentPerDay = (short)rentPerDay;
	}
	
	public static ArrayList<Car> showCarsAvailableForBooking(int seatingCapacityFilter){
		
		ArrayList<Car> availableCars = new ArrayList<>();

		for(Car car : cars) {
			if(car.seatingCapacity == seatingCapacityFilter) availableCars.add(car);
		}
		return availableCars;
	}
	
	public static ArrayList<Car> showCarsAvailableForBooking(int minRent, int maxRent){
		ArrayList<Car> availableCars = new ArrayList<>();
		for(Car car : cars) {
			if(car.rentPerDay <= maxRent && car.rentPerDay >= minRent) availableCars.add(car);
		}
		return availableCars;
	}
	
//	public static ArrayList<Car> showCarsAvailableForBooking(LocalDate newIssueDate, 
//			LocalDate newReturnDate, int seatingCapacityFilter){
//		
//		ArrayList<Car> availableCars = showCarsAvailableForBooking(newIssueDate, newReturnDate);
//		
//		ArrayList<Car> availableCarsAfterMultipleFilters = new ArrayList<>();
//		
//		for(Car car : availableCars) {
//			if(car.seatingCapacity == seatingCapacityFilter) 
//				availableCarsAfterMultipleFilters.add(car);
//		}
//		
//		return availableCarsAfterMultipleFilters;
//	}
//	
//	public static ArrayList<Car> showCarsAvailableForBooking(LocalDate newIssueDate, 
//			LocalDate newReturnDate, int minRent, int maxRent){
//		
//		ArrayList<Car> availableCars = showCarsAvailableForBooking(newIssueDate, newReturnDate);
//		
//		ArrayList<Car> availableCarsAfterMultipleFilters = new ArrayList<>();
//		
//		for(Car car : availableCars) {
//			if(car.rentPerDay <= maxRent && car.rentPerDay >= minRent) 
//				availableCarsAfterMultipleFilters.add(car);
//		}
//		
//		return availableCarsAfterMultipleFilters;
//	}
//	
//	public static ArrayList<Car> showCarsAvailableForBooking(int seatingCapacityFilter, int minRent, int maxRent){
//		
//		ArrayList<Car> availableCars = showCarsAvailableForBooking(seatingCapacityFilter);
//		
//		ArrayList<Car> availableCarsAfterMultipleFilters = new ArrayList<>();
//		
//		for(Car car : availableCars) {
//			if(car.rentPerDay <= maxRent && car.rentPerDay >= minRent) 
//				availableCarsAfterMultipleFilters.add(car);
//		}
//		
//		return availableCarsAfterMultipleFilters;
//	}
//	
//	public static ArrayList<Car> showCarsAvailableForBooking(LocalDate newIssueDate, 
//			LocalDate newReturnDate, int minRent, int maxRent, int seatingCapacityFilter){
//		
//		ArrayList<Car> availableCars = showCarsAvailableForBooking(newIssueDate, newReturnDate);
//		
//		ArrayList<Car> availableCarsAfterMultipleFilters = new ArrayList<>();
//		
//		for(Car car : availableCars) {
//			if(car.rentPerDay <= maxRent && car.rentPerDay >= minRent) 
//				availableCarsAfterMultipleFilters.add(car);
//		}
//		
//		availableCars.clear();
//		
//		for(Car car : availableCarsAfterMultipleFilters) {
//			if(car.seatingCapacity == seatingCapacityFilter) 
//				availableCars.add(car);
//		}
//		
//		return availableCars;
//	}
//	
}

// Every car has a vehicle number, model, seating capacity, rent per day etc.
// Booking status of these cars include the customer details (name, phone no), issue date and return date of the car
// addNewCar()
// Book a specific car based on its availability. A car can have multiple bookings.
// Show cars that are available to book on a date, seating capacity or other filters 
// Using car model, show the details of a particular car and its currently active booking
// Update / delete a car from the system and ensure that the car is not already booked.
// Build functions to update and delete a rental car object while ensuring the condition 
// that update or delete operations are not allowed in case the status of the car is 'booked'.

// Bookings already existing
//6 May - 10 May
//16 May - 17 May
//20 May - 20 May

// Issue date < 6 May -> 10 May < Issue date

// New booking to be done
// 8 May - 10 May
