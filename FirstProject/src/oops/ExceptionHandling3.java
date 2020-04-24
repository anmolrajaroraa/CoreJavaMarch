package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling3 {

//	public void readFromKeyboard() throws InputMismatchException {
////		try {
//			Scanner scanner = new Scanner(System.in);
//			
//			scanner.close();
////		}
//	}
	
	public void readFromKeyboard() throws InputMismatchException{
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			scanner.nextInt();
			scanner.nextLine();
		}
		finally {
			
		}
	}
	
	public static void main(String[] args) {
		try {
			ExceptionHandling3 obj = new ExceptionHandling3();
			obj.readFromKeyboard();
		}
		catch(Exception e) {
			System.out.println("error");
		}

	}

}
