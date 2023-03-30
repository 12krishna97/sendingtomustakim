package exceptionHandling;

public class B {

	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(1/0);
		
		}
		catch(Throwable e) {
			System.out.println("exception handled");
		}
		System.out.println(4);
		System.out.println(5);
	}
}
