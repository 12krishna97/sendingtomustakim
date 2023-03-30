package workingwithcollectionframework;

import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("hi");
		a.add('A');
	    a.add(15);
	    a.add(17);
	    System.out.println(a);
	    a.add(1, 19);
	    System.out.println(a);
	    System.out.println(a.indexOf('A'));
	    a.set(1,20);// set method is used replace the value
	    System.out.println(a);
	
		
	}

}
