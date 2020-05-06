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
		this.seatingCapacity = seatingCapacity;
	}

	public short getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(short rentPerDay) {
		this.rentPerDay = rentPerDay;
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

	private Car(String vehicleNumber, String model, int seatingCapacity, int rentPerDay) {
		this.vehicleNumber = vehicleNumber;
		this.model = model;
		this.seatingCapacity = (byte)seatingCapacity;
		this.rentPerDay = (short)rentPerDay;
	}
	
	public static void addNewCar(String vehicleNumber, String model, int seatingCapacity, int rentPerDay) {
		cars.add(new Car(vehicleNumber, model, seatingCapacity, rentPerDay));
	}
	
	public static ArrayList<Car> showCarsAvailableForBooking(LocalDate newIssueDate, LocalDate newReturnDate) {
		ArrayList<Car> availableCars = new ArrayList<>();
		for(Car car : cars) {
			if(verifyBookingDates(newIssueDate, newReturnDate, car.bookings)) availableCars.add(car);
		}
		return availableCars;
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
	
	public static ArrayList<Car> showCarsAvailableForBooking(LocalDate newIssueDate, 
			LocalDate newReturnDate, int seatingCapacityFilter){
		
		ArrayList<Car> availableCars = showCarsAvailableForBooking(newIssueDate, newReturnDate);
		
		ArrayList<Car> availableCarsAfterMultipleFilters = new ArrayList<>();
		
		for(Car car : availableCars) {
			if(car.seatingCapacity == seatingCapacityFilter) 
				availableCarsAfterMultipleFilters.add(car);
		}
		
		return availableCarsAfterMultipleFilters;
	}
	
	public static ArrayList<Car> showCarsAvailableForBooking(LocalDate newIssueDate, 
			LocalDate newReturnDate, int minRent, int maxRent){
		
		ArrayList<Car> availableCars = showCarsAvailableForBooking(newIssueDate, newReturnDate);
		
		ArrayList<Car> availableCarsAfterMultipleFilters = new ArrayList<>();
		
		for(Car car : availableCars) {
			if(car.rentPerDay <= maxRent && car.rentPerDay >= minRent) 
				availableCarsAfterMultipleFilters.add(car);
		}
		
		return availableCarsAfterMultipleFilters;
	}
	
	public static ArrayList<Car> showCarsAvailableForBooking(int seatingCapacityFilter, int minRent, int maxRent){
		
		ArrayList<Car> availableCars = showCarsAvailableForBooking(seatingCapacityFilter);
		
		ArrayList<Car> availableCarsAfterMultipleFilters = new ArrayList<>();
		
		for(Car car : availableCars) {
			if(car.rentPerDay <= maxRent && car.rentPerDay >= minRent) 
				availableCarsAfterMultipleFilters.add(car);
		}
		
		return availableCarsAfterMultipleFilters;
	}
	
	public static ArrayList<Car> showCarsAvailableForBooking(LocalDate newIssueDate, 
			LocalDate newReturnDate, int minRent, int maxRent, int seatingCapacityFilter){
		
		ArrayList<Car> availableCars = showCarsAvailableForBooking(newIssueDate, newReturnDate);
		
		ArrayList<Car> availableCarsAfterMultipleFilters = new ArrayList<>();
		
		for(Car car : availableCars) {
			if(car.rentPerDay <= maxRent && car.rentPerDay >= minRent) 
				availableCarsAfterMultipleFilters.add(car);
		}
		
		availableCars.clear();
		
		for(Car car : availableCarsAfterMultipleFilters) {
			if(car.rentPerDay <= maxRent && car.rentPerDay >= minRent) 
				availableCars.add(car);
		}
		
		return availableCars;
	}
	
	private static boolean verifyBookingDates(LocalDate newIssueDate, LocalDate newReturnDate, 
			ArrayList<BookingStatus> bookings) {
		
		if(newReturnDate.compareTo(newIssueDate) < 0 || newIssueDate.compareTo(LocalDate.now()) < 0) {
			return false;
		}
		
		for(BookingStatus booking : bookings) {
			if(booking.getIssueDate().compareTo(newIssueDate) > 0 && 
					booking.getIssueDate().compareTo(newReturnDate) < 0) {
				return false;
			}
			if(booking.getReturnDate().compareTo(newIssueDate) > 0 && 
					booking.getReturnDate().compareTo(newReturnDate) < 0) {
				return false;
			}
		}
		
		return true;		
	}
	
	public String bookCar(String customerName, long customerPhoneNo, LocalDate issueDate, LocalDate returnDate) {
		if(verifyBookingDates(issueDate, returnDate, bookings)) {
			BookingStatus booking = new BookingStatus(customerName, customerPhoneNo, issueDate, returnDate);
			bookings.add(booking);
			return "Booking Done for " + customerName + " from " + issueDate + " to " + returnDate;
		}
		return "Booking cannot be made from " + issueDate + " to " + returnDate;
	}
	
}

// Every car has a vehicle number, model, seating capacity, rent per day etc.
// Booking status of these cars include the customer details (name, phone no), issue date and return date of the car
// addNewCar()
// Book a specific car based on its availability. A car can have multiple bookings.
// Show cars that are available to book on a date, seating capacity or other filters 

// Bookings already existing
//6 May - 10 May
//16 May - 17 May
//20 May - 20 May

// Issue date < 6 May -> 10 May < Issue date

// New booking to be done
// 8 May - 10 May
