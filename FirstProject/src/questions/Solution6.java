package questions;

import java.util.LinkedList;

public class Solution6 {

	LinkedList<String> list;
	int[] array = new int[4];
	
	public Solution6() {
	 
		list = null;
		
	}
	
	public Solution6(String str) {
	
		list = new LinkedList<String>();
		list.add(str);
		
		
//		array2d[0] = new int[5];
//		array2d[1] = new int[6];
//		array2d[0][1] = 100;
		
	}
	
	public void exceptionDemo(int i, String str) {
		
		int element = array[i];
		
		System.out.println("element at i index is " + element);
		
		int indexOfNode = list.indexOf(str);
		
		System.out.println("str found at " + indexOfNode);
		
	}
	
	public static void main(String[] args) {
		
		Solution6 obj = new Solution6("first node");
		obj.exceptionDemo(1, "first node");
		obj.exceptionDemo(100, "second node");
		
		System.out.println("Everything is still working even after some error occured...");

	}

}
