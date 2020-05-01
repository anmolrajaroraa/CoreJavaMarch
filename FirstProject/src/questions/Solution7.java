package questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Solution7 {

	Stack<Character> stack = new Stack<>();
	
	Queue<Character> queue = new LinkedList<>(); //upcasting - convert child object into parent
	
	public void pushIntoStack(char c) {
		stack.add(c);
	}
	
//	public static void doSomething() {
//		pushIntoStack('a');
//	}
	
	public void enqueueElement(char c) {
		queue.add(c);
	}
	
	public char popFromStack() {
		return stack.pop();
	}
	
	public char dequeueElement() {
		return queue.remove();
	}
	
	public static void main(String[] args) {
		
//		doSomething();
		
		Scanner scanner = new Scanner(System.in);
		
		Solution7 obj = new Solution7();
		
		System.out.println("Enter a word to check if it's palindrome or not..");
		
		String word = scanner.nextLine();
		
		String modifiedWord = word.replace(" ", "").replace(",", "").toLowerCase();
		
		System.out.println(modifiedWord);
		
		char letters[] = modifiedWord.toCharArray();
		
		for(char letter : letters) {
			
			obj.pushIntoStack(letter);
			
			obj.enqueueElement(letter);
			
		}
		
		boolean isPalindrome = true;
		
		for(int i = 0; i < letters.length; i++) {
			
			if( obj.popFromStack() != obj.dequeueElement() ) {
				isPalindrome = false;
				break;
			}
			
		}
		
		System.out.println("The word " + word + " is " + 
		( isPalindrome ? "a palindrome" : "not a palindrome" ) );
		
		scanner.close();
		
	}

}
