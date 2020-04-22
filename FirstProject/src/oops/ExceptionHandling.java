package oops;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		// try block is like a stage for the code that can generate some exception when
		//  the code is executed. If exception occurs, we should have some exception handler
		// to salvage the situation. When some exception occurs, an object of Exception class
		// or some sublcass of Exception is created, so we need to catch it and provide some
		//  way of managing the excpetion and allow the program to continue without stopping abruptly
		try {
			Scanner scanner = new Scanner(System.in);
			
			int number = scanner.nextInt();
			
			int number2 = scanner.nextInt();
			
			System.out.println(number / number2);
			
			System.out.println("number is " + number);
			
			byte b = (byte) number;
			
			int arr[] = new int[5];
		
			System.out.println( arr[100] );
			
			scanner.close();
		}
		catch(Exception e) {
			System.out.println("Catch block received exception... Something unusual happened");
//			e.printStackTrace();
		}
		
//		System.out.println("Program continues even after exception occured...");
		System.out.println("Thanku for visiting us!!");
		
		try {
			int i = 8 / 0;
		}
		catch(Exception e) {
			System.out.println("Exception!!!");
		}
	}

}
