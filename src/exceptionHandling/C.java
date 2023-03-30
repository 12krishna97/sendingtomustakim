package exceptionHandling;

public class C {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 2);
			System.out.println(0 / 2);
			System.out.println(2 / 0);
			} catch (Exception a) {
			a.printStackTrace();
} 
		catch (ArithmeticException e) {
			System.out.println("handled");
		}
		System.out.println("no worries");
	}

}
