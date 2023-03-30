package arry;

import java.util.Scanner;

public class Creating_arr_using_newKeyword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=sc.nextInt();
		int arr[]=new  int[size];
		//for loop to take input
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//for loop for displaying
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
