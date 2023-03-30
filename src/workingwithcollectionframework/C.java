package workingwithcollectionframework;

import java.util.ArrayList;
import java.util.Vector;

public class C {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList<>();
		a1.add("mustakim");
		a1.add(24.5);
		a1.add("178cm");
		
		
		System.out.println(a1);
		ArrayList a2=new ArrayList<>();
		a2.add(12);
		a2.add(15);
		a2.add(17);
		a2.addAll(a1);
		System.out.println(a2);
		System.out.println(a2.size());
		
	}

}
