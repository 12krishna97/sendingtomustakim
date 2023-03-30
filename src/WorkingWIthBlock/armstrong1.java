package WorkingWIthBlock;

import java.util.Scanner;

public class armstrong1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number:");
		// to getting the count of given number
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		while (temp!= 0) {
			count++;
			temp = temp / 10;
		}
		// finding the factorial of each number 153 =1^3+5^3+3^3 (1+125+27=)
		int arm = 0;
		int temp1 = num;
		while (temp1 != 0) {
			int rem = temp1 % 10;
			int fact = 1;
			for (int i = 0; i <= count; i++) {
				fact = fact + rem;
			}
			arm = arm +fact;
			temp1 =temp1/10;
		}
		if(arm==num) {
			System.out.println("armstrong");
		}else {
			System.out.println("not an armstong");
		}
	}

}
