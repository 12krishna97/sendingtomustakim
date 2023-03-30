package arry;

import java.util.Scanner;

public class abc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		 int size = sc.nextInt();
		 int arr[] = new int[size];
		 
		 System.out.println("enter the values here");
		 int product = 1;
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.nextInt(); 
			 product *= arr[i];
		 }
		 System.out.println(product);
		 	}

}
