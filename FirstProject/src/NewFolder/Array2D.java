package NewFolder;

public class Array2D {

	public static void main(String[] args) {

//		[ []  []    []   []   []  ] -> 2 D Array -> Multi-dimensional array
//		
//		[   1,2,3,4,5   ] -> 1D Array
//				
//		[   [1,2,3,4,5],   [6,7,8,9,10],   [11,12,13,14,15]         ]
		
		int arr[] = { 1, 2, 3, 4, 5};  //array initializer method
		int arr2[] = new int[5];
		arr2[0] = 100;
		
		int new_arr[][] = { {1,2,3,4}, {1,2,3}, {1,2}, {1}, {10} };
		
//		new_arr[3] = new int[5];
		//    { {1,2,3,4,5}, {2,3,4,5,6}, {3,4,5,6,7}, {0,0,0,0,0} }
		
//		new_arr[3][0] = 10;
//		new_arr[3][1] = 20;
//		new_arr[3][2] = 30;
//		new_arr[3][3] = 40;
//		new_arr[3][4] = 50;
		
		for(int i = 0; i < new_arr.length; i++) {
			int []temp_arr = new_arr[i];
			for(int j = 0; j < temp_arr.length; j++) {
				System.out.print( temp_arr[j] + ", ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < new_arr.length; i++) {
			for(int j = 0; j < new_arr[i].length; j++) {
				System.out.print( new_arr[i][j] + ", " );
			}
			System.out.println();
		}
		
		new_arr[4] = new int[5];
		new_arr[4][0] = 100;
		
		System.out.println("***************************");
		
		for(int i = 0; i < new_arr.length; i++) {
			for(int j = 0; j < new_arr[i].length; j++) {
				System.out.print( new_arr[i][j] + ", " );
			}
			System.out.println();
		}
	}

}
