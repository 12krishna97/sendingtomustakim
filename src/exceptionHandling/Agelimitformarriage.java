package exceptionHandling;

import java.util.Scanner;

public class Agelimitformarriage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :");
		 int age=sc.nextInt();
		 if(age>20) {
			 System.out.println("welcom to matrimony");
		 }else {
			 throw new matrimonyexception("children are prohibited");
		 }
	}

}
