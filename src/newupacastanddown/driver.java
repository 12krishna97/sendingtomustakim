package newupacastanddown;

public class driver{
	public static void main(String[] args) {
		// first method upcasting and down casting
		System.out.println("first method ");
		A a1 = new A();
		C c1 = new C();
		a1 = c1; // upcasting

		C c2 = (C) a1; //downcasting

		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.c);

		// secodn method updacasting
		
		System.out.println("second method");
		A a2;
		B b1 = new B();
		a2 = b1; // upcasting
		
		B b2 = (B) a2; // downcasting
		System.out.println(b2.a);
		System.out.println(b2.b);
		
//		third method 
		
		System.out.println("thired method");
		
		A a3 = new C();
		
		C c3 =(C) a3; // downcasting
		
		System.out.println(c3.a);
		System.out.println(c3.b);
		System.out.println(c3.c);
		driver d=new driver();
		

		
	}

}
