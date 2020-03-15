
public class FirstClass {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			if(i==5) {
				System.out.println("Going to skip the printing");
				continue;
			}
			else if(i==9) {
				System.out.println("Going to break the loop");
				break;
			}
			else System.out.println(i);
//			else {
//				System.out.println(i);
//			}
			
		}

	}

}
