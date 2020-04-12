package questions;

public class Solution3 {

	public static void main(String[] args) {
		String binary = Integer.toBinaryString(5);
		System.out.println(binary);
		
		int dec = Integer.parseInt(binary, 2);
		System.out.println(dec);

	}

}
