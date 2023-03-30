package exceptionHandling;

public class A {
	 public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
		System.out.println(1/0);
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled");
		}
		System.out.println(4);
		System.out.println(5);
	}

}
