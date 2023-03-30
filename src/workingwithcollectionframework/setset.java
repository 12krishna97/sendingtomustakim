package workingwithcollectionframework;

import java.util.HashSet;

public class setset {
	public static void main(String[] args) {
		HashSet s1= new HashSet();
		
		s1.add(1);
		s1.add(1);
		s1.add(2);
		s1.add("abc");
		s1.add('d');
		s1.add("ac");
		s1.add('c');
		
		
		System.out.println(s1);
		for(Object o:s1) {
			System.out.println(o);
		}
	}

}
