package questions;

public class Solution4 {

	public static void main(String[] args) {
		
		int arr[][] = {{-1,-2,-3,-4,-5,-6}, {-7,-8,-9,-0,-1,-2}, {-3,-4,-5,-6,-7,-8}, 
				{-9,-0,-1,-2,-3,-4}, {-5,-6,-7,-8,-9,-0}, {-1,-2,-3,-4,-5,-6}};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print( arr[i][j] + ", " );
			}
			System.out.println();
		}
		
		int max = 0;
//		boolean isMaxSet = false;
		int hourGlassStartingIndexI = 0;
		int hourGlassStartingIndexJ = 0;
		
		for(int i = 0; i < arr.length - 2; i++) {
			for(int j = 0; j < arr[i].length - 2; j++) {
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				System.out.println(sum + " at " + i + " " + j);
				
//				if(!isMaxSet) {
//					max = sum;
//					isMaxSet = true;
//				}
				
				if(i == 0 && j == 0) {
					max = sum;
				}
				
//				if(isMaxSet == false) {
//					max = sum;
//					isMaxSet = true;
//				}
				
				if(sum > max) {
					max = sum;
					hourGlassStartingIndexI = i;
					hourGlassStartingIndexJ = j;
				}
			}
		}
		System.out.println("Max is " + max + " at " + hourGlassStartingIndexI + " " + hourGlassStartingIndexJ);

	}

}
