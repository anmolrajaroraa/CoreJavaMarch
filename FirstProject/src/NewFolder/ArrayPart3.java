package newFolder;

public class ArrayPart3 {

	public static void main(String[] args) {
		
		//{ { { 0,0,0,0,0 }, {0,0,0,0}, {} } , { {}, {} } , { {} } }
	
		int arr[][][] = new int[3][][];
		
		arr[0] = new int[3][];
		arr[1] = new int[2][];
		arr[2] = new int[1][];
		
		arr[0][0] = new int[5];
		arr[0][1] = new int[4];
		arr[0][2] = new int[3];
		
		arr[1][0] = new int[2];
		arr[1][1] = new int[1];
		
		arr[2][0] = new int[6];
		
		arr[0][0][0] = 1;
		arr[0][0][1] = 1;
		
		System.out.println("[");
		for(int i = 0; i < arr.length; i++) {
			System.out.print("[");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("[");
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + ", ");
				}
				System.out.print("]");
			}
			System.out.println("]");
		}
		System.out.println("]");
	}

}
