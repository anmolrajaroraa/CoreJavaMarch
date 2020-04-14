package questions;

import java.util.ArrayList;

public class Solution3 {
	
	public static void convertDecimalToBinary(int number) {
//		ArrayList<Integer> binaryNumber = new ArrayList<>();
		String binaryNumber = "";
		while(number != 0){
//			binaryNumber.add(0, number % 2);
			binaryNumber = Integer.toString(number % 2) + binaryNumber;
			number = number / 2;
		}
		System.out.println("Binary number is " + binaryNumber);
	}
	
	public static void findMaxNoOfConsecutive1s(String binaryNumber) {
		int max = 0;
		int count = 0;
//		for(int i = 0; i < binaryNumber.length(); i++) {
//			char letter = binaryNumber.charAt(i);
//		}
		for(char letter : binaryNumber.toCharArray()) {
			if(letter == '1') {
				count++; 
				if(count > max) max = count; // max -> 3
			}
			else {
				count = 0;
			}
		}
		System.out.println("Consecutive 1s -> " + max);
	}

	public static void main(String[] args) {
		//decimal to binary
		String binary = Integer.toBinaryString(500);
		System.out.println(binary);
		convertDecimalToBinary(10);
		
		findMaxNoOfConsecutive1s("101101100111");
		
		// binary to decimal
		int dec = Integer.parseInt("A", 16);
		System.out.println(dec);
		
		int x = 'a';
		System.out.println(x);
		
		char y = 97;
		System.out.println(y);
		
		// max no of consecutive 1's
		String binaryNumber = "0101001010010";  //   -> 1
		System.out.println(Integer.parseInt(binaryNumber, 2));
		
//		for(int i = 0; i < binaryNumber.length(); i++) {
//			
//		}
		
		
		// Binary to decimal
		
		int sum = 0;
		
		for(int i = binaryNumber.length() - 1; i >= 0; i--) {
		
			String letter = binaryNumber.substring(i,i+1);
			int digit = Integer.parseInt(letter);
			sum += Math.pow(2, binaryNumber.length() - 1 - i) * digit;
			
		}
		
		System.out.println("Decimal number is " + sum);
		
//		binaryNumber[length - 1 ] -> last element

	}
	
//	12  11  10  9  8  7
//	0   1    2  3   4  5
	
	// 0000000 -> 0
	// 00010010 -> 1
	// 11010101 -> 2
	// 11101101 -> 3
	// 11110111 -> 4

}
