package Encapsulation;

public class runner {
	public static void main(String[] args) {
		Std s1 = new Std("krishna", 1, 1);
		Std s2 = new Std("venu", 2, 4);
		Std s3 = new Std("kitty", 3, 2);
		Std s4 = new Std("kitkat", 4, 5);
		Std s5 = new Std("venu", 5, 5);
		displayDetails(s1);
		displayDetails(s2);
		displayDetails(s3);
		displayDetails(s4);
		displayDetails(s5);

	}

	public static void displayDetails(Std s) {
		System.out.println("Student name:" + s.getSname());
		System.out.println("Student id:" + s.getSid());
		System.out.println("Semester:" + s.getSemester());
		System.out.println("==============================");
	}
}
