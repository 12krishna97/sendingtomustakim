package constructorChaining;

public class b1 extends a1 {

	b1() {
		this(10);
		System.out.println("const-4");
	}

	b1(int a) {
		this('a', 10.2);
		System.out.println("const-5");
	}

	b1(char a, double b) {
		System.out.println("const-6");

	}
	public static void main(String[] args) {
		b1 b= new b1();
	}

}
  