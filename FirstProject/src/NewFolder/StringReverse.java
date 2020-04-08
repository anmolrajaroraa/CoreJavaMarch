package newFolder;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string : ");
		
		String s = scanner.nextLine();  //hello
		
		char originalArray[] = s.toCharArray();   // ['h', 'e', 'l', 'l', 'o']
		
//		s.toCharArray()
		
		char newArray[] = new char[s.length()];
		
		System.out.println(s);
		
		for(char ch : originalArray) {
			System.out.println(ch);
		}
		
		int length = newArray.length;
		
		for(int i = 0; i < originalArray.length; i++) {
			newArray[length - 1 - i] = originalArray[i];
		}
		
		for(char ch : newArray) {
			System.out.println(ch);
		}
		
		scanner.close();
	}

}
