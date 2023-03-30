package workingwithcollectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class treeset {
	
	public static void main(String[] args) {
		TreeSet t= new TreeSet();
		t.add(1);
	    t.add(5);
	    t.add(9);
	    t.add(0);
		
		System.out.println(t);
		Iterator i=t.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
