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

//length -> 5
//hello
//
//0 -> 4      0
//1 -> 3		1
//2 -> 2      2
//3 -> 1      3
//4 -> 0     4
//
//s.length() - 1 - i
//5 - 1 - 0 -> 4
//5 - 1 - 1 -> 3
//5 - 1 - 2 -> 2
//5 - 1 - 3 -> 1
//5 - 1 - 4 -> 0
