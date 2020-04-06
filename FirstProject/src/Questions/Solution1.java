package Questions;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
		// Scanner - input
		
		// int - 5 - n - no of strings 
		// always believe
		// [awy eiv][lasblee]
	
		// something wonderful
		// [smtigwnefl][oegn odru]
		   
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of strings : ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			String s = scanner.nextLine();
			System.out.print("[");
			for(int j=0; j<s.length(); j+=2) {
				System.out.print( s.charAt(j) );
			}
			System.out.print("]");
			System.out.print("[");
			for(int j=1; j<s.length(); j+=2) {
				System.out.print( s.charAt(j) );
			}
			System.out.print("]");
			
			System.out.println();
			
		}
		
		scanner.close();

	}

}
