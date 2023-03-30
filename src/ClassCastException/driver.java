package ClassCastException;

public class driver {
	public static void main(String[] args) {
		A a= new A();
		// without performing upcasting if we try to perform downcasting then throws error
		//called by classCastException
		B b = (B)a;
		
		System.out.println(b.a);
	}

}
