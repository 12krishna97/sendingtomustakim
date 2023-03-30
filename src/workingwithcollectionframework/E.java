package workingwithcollectionframework;

import java.util.ArrayList;
import java.util.TreeSet;

public class E {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(11);
		a1.add(17);
		
		a1.add(11);
		
		TreeSet t=new TreeSet(a1);
		System.out.println(t);
		
	}
}
