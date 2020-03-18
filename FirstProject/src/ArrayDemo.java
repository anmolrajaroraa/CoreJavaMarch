
public class ArrayDemo {

	public static void main(String ...args) {
		
		//  C/C++ used primitive type arrays
		//  means the arr variable stores the complete array
		//  but java says array will be treated as an object 
		int arr[] = {1,2,3,4,5,6,7,8,9,10};  // array initialiser way
		int []arr2 = {1,2,3,4,5};
		int[] arr3 = {1,2,3,4,5};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println( arr[i] );
		}
		
		System.out.println( arr );
		
		int arr4[] = {};
		
//		System.out.println(arr4[0]);
		
		int arr5[] = new int[5]; //dimension expression way
		
		arr5[0] = 100;
		arr5[1] = 200;
		arr5[2] = 300;
		arr5[3] = 400;
		arr5[4] = 500;
//		arr5[5] = 600;
		arr5[0] = 0;
		
		for(int i = 0; i < arr5.length; i++) {
			System.out.println( arr5[i] );
		}
		
		String arr6[] = new String[5];
		
		arr6[0] = "English";
		arr6[1] = "Biology";
		arr6[2] = "Physics";
		arr6[3] = "Chemistry";
		arr6[4] = "Maths";
		arr6[0] = null;
		
		for(int i = 0; i < arr6.length; i++) {
			System.out.println( arr6[i] );
		}
		
		String arr7[] = {"English", "Biology", "Physics", "Chemistry", "Maths"};
		
		
		Integer arr8[] = new Integer[5]; // by default all values will be null 
		// because Integer is a wrapper class and the default value of object is null
		
		for(int i = 0; i < arr8.length; i++) {
			System.out.println( arr8[i] );
		}
	}

}
