package NewFolder;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter shape");
		
		String shape = scanner.nextLine();
		
		if(shape.equals("rectangle")) {
			System.out.println("Enter length");
			int length = scanner.nextInt();
			System.out.println("Enter bredth");
			int breadth = scanner.nextInt();
			System.out.println( "Area = length * breadth ");
			System.out.println( "Area = " + length * breadth );
		}
		
		scanner.close();

	}

}
