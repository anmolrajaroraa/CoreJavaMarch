package NewFolder;

public class ArrayDemoPart2 {

	public static void main(String[] args) {
		
		//1d array
		int arr[] = {1,2,3,4,5};
		
		// traditional for loop - indexed loop
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("*************");
		
		// enhanced for loop (1D)
		for(int element : arr) {
			System.out.println(element);
		}
		
		System.out.println("*************");
		
		//2d array
		int arr2D[][] = { {1,2,3,4}, {5,6,7}, {8,9} };
		
		// enhanced for loop (2D)
		
		for( int[] array  : arr2D) {
			System.out.print("[");
			for(int element : array) {
				System.out.print(element + ", ");
			}
			System.out.println("]");
		}
		
		int new_arr[][] = new int[5][];
		new_arr[0] = new int[5];
		new_arr[1] = new int[4];
		new_arr[2] = new int[3];
		new_arr[3] = new int[2];
		new_arr[4] = new int[6];
		
		new_arr[0][0] = 1;
		
		System.out.println("*************");
		
		
		for( int[] array  : new_arr) {
			System.out.print("[");
			for(int element : array) {
				System.out.print(element + ", ");
			}
			System.out.println("]");
		}
		
		System.out.println("*************");

		int arr3D[][][] = {  {{1,2},{3,4}} , {{5,6},{7,8}}  , {{9,20},{34,23},{3255,535,3}}  };    
		
		for( int [][]array2D : arr3D) {
			System.out.print("[");
			for( int arr1D[] : array2D ) {
				System.out.print("[");
				for( int element : arr1D ) {
					System.out.print(element + ", ");
				}
				System.out.print("]");
			}
			System.out.println("]");
		}
		
	}

}
