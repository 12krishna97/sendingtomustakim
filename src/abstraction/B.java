package abstraction;

public class B extends A{
	void M1() {
		System.out.println("method-2");
	}
	
	public static void main(String[] args) {
		A a = new B();
		a.M1();
		a.M();
	}

}
