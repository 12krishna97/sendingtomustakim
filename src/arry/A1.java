package arry;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");

		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("enter the element");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
