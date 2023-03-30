package ArrayOfObjects;

import java.util.Scanner;

public class Company {
	String ename;
	int eid;
	double exp;

	public Company(String ename, int eid, double exp) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.exp = exp;
	}

	public String toString() {
		return "Ename : " + this.ename + " " + "Eid: " + this.eid + " " + "Experience: " + this.exp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		Company[] data = new Company[size];

		for (int i = 0; i < data.length; i++) {
			System.out.println("Enter the ename");
			String ename = sc.next();
			System.out.println("Enter the eid");
			int eid = sc.nextInt();
			System.out.println("Enter the year of experience");
			double exp = sc.nextDouble();
			data[i]=new Company(ename, eid, exp);

		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
