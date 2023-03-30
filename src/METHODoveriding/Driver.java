package METHODoveriding;

public class Driver {
	public static void main(String[] args) {
		A a = new A();
		a.Light();
System.out.println();
		B b = new B();
		b.Light();
		System.out.println();
		
		a=b;
		
		a.Light();
	}

}
