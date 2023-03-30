package METHODS;

public class abc {

	boolean even_odd(int a) {
		if (a % 2 == 0) {
			return true;

		} else
			return false;
	}


	public static void main(String[] args) {
		abc a1 = new abc();
		System.out.println(a1.even_odd(5));

	}

}
