package com.bmpl.CarRental.view;

import java.time.LocalDate;
import java.util.ArrayList;

import com.bmpl.CarRental.model.BookingStatus;
import com.bmpl.CarRental.model.Car;

public class Main {

	public static void main(String[] args) {
		
		Car.addNewCar("DL2CAR0007", "Swift Dzire", 5, 1000);
		Car.addNewCar("DL2CAR0108", "Mercedes Benz A-Class", 5, 5000);
		System.out.println(Car.getCars());
		Car car = Car.getCars().get(0);
		Car car2 = Car.getCars().get(1);
		System.out.println(car.getDetails());
//		System.out.println(car.getModel());
//		System.out.println(car.getVehicleNumber());
//		System.out.println(car.getBookings());
//		System.out.println(car.getRentPerDay());
//		System.out.println(car.getSeatingCapacity());
		
		String message = car.bookCar("Ram Kumar", 123456789, LocalDate.of(2020, 5, 16), LocalDate.of(2020, 5, 20));
		System.out.println(message);
		
		System.out.println(car.getBookings());
		BookingStatus booking1 = car.getBookings().get(0);
		System.out.println(booking1.getCustomerName());
		System.out.println(booking1.getCustomerPhoneNo());
		System.out.println(booking1.getIssueDate());
		System.out.println(booking1.getReturnDate());
		
		String messageBooking2 = car.bookCar("Shyam Kumar", 123456789, LocalDate.of(2020, 5, 5), LocalDate.of(2020, 5, 5));
		String messageBooking3 = car.bookCar("Mohan Kumar", 123456789, LocalDate.of(2020, 5, 12), LocalDate.of(2020, 5, 15));
		String messageBooking4 = car.bookCar("Anna", 123456789, LocalDate.of(2020, 5, 8), LocalDate.of(2020, 5, 11));
		String messageBooking5 = car.bookCar("Jenny", 123456789, LocalDate.of(2020, 5, 11), LocalDate.of(2020, 5, 13));
		
//		System.out.println(messageBooking2);
//		System.out.println(messageBooking3);
//		System.out.println(messageBooking4);
//		System.out.println(messageBooking5);
//		
//		ArrayList<Car> carsAvailable = Car.showCarsAvailableForBooking(LocalDate.of(2020, 5, 11), LocalDate.of(2020, 5, 16));
//		System.out.println("cars available are " + carsAvailable);
//		
//		carsAvailable = Car.showCarsAvailableForBooking(7);
//		System.out.println("cars available are " + carsAvailable);
//		
//		carsAvailable = Car.showCarsAvailableForBooking(500, 800);
//		System.out.println("cars available are " + carsAvailable);
		
		// 5
		// 6-10
		// 12-15
		
		System.out.println(Car.showCarsAvailableForBooking(LocalDate.of(2020, 5, 11), LocalDate.of(2020, 5, 11), 500, 1000, 5));
		
		System.out.println(car.getDetails());
		System.out.println(car2.getDetails());
		System.out.println(Car.getCars());
		car2.deleteCar();
		System.out.println(Car.getCars());
	}

}
