import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no. between 1 and 7");
		
		int a = scanner.nextInt();
		float b = scanner.nextFloat();
		
		switch(a) {
		case 1 : 
			System.out.println("Monday");
			break;
		case 2 : 
			System.out.println("Tuesday");
			break;
		case 3 : 
			System.out.println("Wednesday");
			break;
		case 4 : 
			System.out.println("Thursday");
			break;
		case 5 : 
			System.out.println("Friday");
			break;
		case 6 : 
			System.out.println("Saturday");
			break;
		case 7 : 
			System.out.println("Sunday");
			break;
		default : System.out.println("Invalid number");
		}
		
		System.out.println("What do you want to order : ");
		
		String order = scanner.next();
		
		switch(order) {
		case "burger" : 
			System.out.println("Here's your burger");
		case "soft drink":
			System.out.println("Do you want soft drink ? ");
			String choice = scanner.next();
			if(choice.equals("yes")) {
				System.out.println("Here's your soft drink!");
			}
			else {
				System.out.println("Thanks for ordering!");
			}
			break;
		case "momos" :
			System.out.println("Here are your momos");
		case "mayo sauce":
			System.out.println("Do you want mayonnaise ? ");
			choice = scanner.next();
			if(choice.equals("yes")) {
				System.out.println("Here's your mayo sauce!");
			}
			else {
				System.out.println("Thanks for ordering!");
			}
			break;
		default : System.out.println("Sorry, we don't serve that!!");
		}
		
		scanner.close();
		
	}

}
