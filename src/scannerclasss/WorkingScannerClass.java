package scannerclasss;

import java.util.Scanner;
public class WorkingScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println(c);
	}
}
