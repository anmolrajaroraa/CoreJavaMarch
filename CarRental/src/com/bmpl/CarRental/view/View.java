package com.bmpl.CarRental.view;

import com.bmpl.CarRental.controller.CarOperations;

public class View {

	public static void main(String[] args) {
		
		CarOperations operations = new CarOperations();
		System.out.println(operations.addNewCar("DLABCD0001", "Bugatti Chiron", 2, 100000));
		System.out.println(operations.addNewCar("DLABCD0002", "Hyundai Creta", 5, 1000));
		System.out.println(operations.addNewCar("DLABCD0003", "Mahindra Scorpio", 7, 1500));
		System.out.println(operations.deleteCar("DLABCD0001"));
		System.out.println();
		System.out.println(operations.getDetails("DLABCD0002"));
		System.out.println();
		System.out.println(operations.getDetails("DLABCD0003"));
		System.out.println(operations.bookCar("DLABCD0003", "Ram", "8285847775", "2020-06-16", "2020-06-20"));
		System.out.println();
		System.out.println(operations.getDetails("DLABCD0003"));
		System.out.println(operations.showCarsAvailableForBooking("2020-06-11", "2020-06-16"));
	}

}
