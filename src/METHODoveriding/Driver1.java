package METHODoveriding;

public class Driver1 {
	public static void main(String[] args) {
		C c = new C();
		c.M();
		
		System.out.println();
		
		c= new D();
		c.M();
		
		System.out.println();
		
		D d = new E();
		d.M();
	}

}
