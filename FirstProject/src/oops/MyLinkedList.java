package oops;

import java.util.Scanner;

class Node{
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
	
public static Node insert(int element, Node head) {
		
		if(head == null) {
			Node node = new Node(element);
			head = node;
			return head;
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			Node node = new Node(element);
			node = head;
			current.next = node;
			return head;
		}
		
	}
	
	static void display(Node head) {
		
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		
	}
}

public class MyLinkedList {
	
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();  //4
		
		Node head = null;
		
//		for(int i=0; i < N; i++) {
//			System.out.println(i);
//		}
		
//		System.out.println(N);
		
		while(N-- > 0) {
//			System.out.println(N);
			
			int element = scanner.nextInt();
			head = Node.insert(element, head);
			
		}
		
		 Node.display(head);
		
		System.out.println(head);
		
		
		
		
		
		
		
		
//		while(N++ < 10) { 
//			
//		}
		
		scanner.close();
		
//		10 > 0
//		9
//		9 > 0
//		8
//		8 > 0
//		7
//		7 > 0
//		6
//		6 > 0
//		5
//		5 > 0
//		4
//		4 > 0
//		3
//		3 > 0
//		2
//		2 > 0
//		1
//		1 > 0
//		0
//		0 > 0
		
	}

}
