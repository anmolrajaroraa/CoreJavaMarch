package com.bmpl.CarRental.model;

import java.util.ArrayList;
import java.util.Date;

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
	
	public String bookCar(String customerName, long customerPhoneNo, Date issueDate, Date returnDate) {
		for(BookingStatus booking : bookings) {
			if(issueDate.compareTo(booking.getIssueDate()) > 0 && issueDate.compareTo(booking.getReturnDate()) < 0) {
				return "Car is already booked! Please check out another car or try booking for some other date...";
			}
		}
		return "";
	}
	
}

// Every car has a vehicle number, model, seating capacity, rent per day etc.
// Booking status of these cars include the customer details (name, phone no), issue date and return date of the car
// addNewCar()
// Book a specific car based on its availability. A car can have multiple bookings.

//6 May - 10 May
//16 May - 17 May
//20 May - 20 May

//10 May > 8 May > 6 May -> greater than 0 

//18 May
