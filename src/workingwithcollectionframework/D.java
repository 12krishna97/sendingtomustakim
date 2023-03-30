package workingwithcollectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class D {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(5);
		a1.add(3);
		a1.add("hello");
		Iterator i=a1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("============");
		ListIterator i1=a1.listIterator(a1.size());
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
	}
}
