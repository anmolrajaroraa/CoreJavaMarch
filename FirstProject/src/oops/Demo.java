package oops;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import oops2.BB;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
//			int arr[] = new int[5];
//			System.out.println(arr[100]);
			
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println( num1 / num2);
		}
//		catch(IOException e) {
//			System.out.println("error");
//		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is invalid...");
		}
		catch(InputMismatchException e) {
			System.out.println("Input mismatch");
		}
		finally {
			scanner.close();
		}

	}

}
