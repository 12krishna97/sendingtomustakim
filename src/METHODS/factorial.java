package METHODS;

public class factorial {
	public void fact(int a) {
		int facto = 1;
		for (int i = 1; i <= a; i++) {
			facto = facto * i;
		}
		System.out.println(facto);
	}

	public static void main(String[] args) {
		factorial ab = new factorial();
		ab.fact(3);

	}
}
