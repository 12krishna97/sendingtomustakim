package polymerphism;

// complie time polymerphism
public class A {
	public void a() {
		System.out.println("hi");
	}

	public void a(int a) {
		System.out.println("hello");
	}

	public void a(char a) {
		System.out.println("how are you");
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.a();
		a1.a('A');
		a1.a(10);
	}

}
