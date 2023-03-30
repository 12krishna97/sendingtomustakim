package arry;

import java.util.Scanner;

public class papu {
	
	public static void method(int b[]) {
		int prod=1;
		for(int i=0;i<b.length;i++) {
			prod=prod*b[i];
		}
		System.out.println(prod);
		
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter the values ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
}
		method(a);
	}

}
