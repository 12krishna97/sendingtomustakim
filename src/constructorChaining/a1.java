package constructorChaining;

public class a1 {
	a1() {
		this(10);
		System.out.println("const-1");
	}

	a1(int a) {
		this('a', 10.2);
		System.out.println("const-2");
	}

	a1(char a, double b) {
		System.out.println("const-3");

	}

}
