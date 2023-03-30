package workingwithcollectionframework;

import java.util.Stack;

public class WorkingWithStack {

	public static void main(String[] args) {
		Stack s1=new Stack();
		s1.add(10);
		s1.push(20);
		s1.push(30);
		s1.push("Hello");
		s1.push("hye");
		System.out.println(s1);
		while(!s1.isEmpty()) {
			System.out.println(s1.pop());
		}
		
	}
}
