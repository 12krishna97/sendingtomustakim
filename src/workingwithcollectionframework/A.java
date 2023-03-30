package workingwithcollectionframework;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("Hello");
		a.add(10);
		a.add(true);
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.size());
		System.out.println("=================");
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		System.out.println("========================");
		for(Object o:a) {
			System.out.println(o);
		}
		a.remove(1);
		System.out.println(a);
	}
}
