package upcastingANDdowncasting;

public class driver {
	public static void main(String[] args) {
		B b1 = new B();
		A a1 = new A();
		
		a1 = b1;// upcasting
		
		System.out.println(a1.a);
		System.out.println(a1.b);
	//	System.out.println(a1.c); 
	//	System.out.println(a1.d);
		
		// downcasting
		System.out.println("its a downcasting");
		B b2 = (B) a1;
		System.out.println(b2.c);
		System.out.println(b2.d);
		
	}

}
