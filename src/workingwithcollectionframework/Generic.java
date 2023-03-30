package workingwithcollectionframework;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(5);
		a1.add(4);
		
		for(Integer i:a1) {
			System.out.println(i);
		}
	}
}
