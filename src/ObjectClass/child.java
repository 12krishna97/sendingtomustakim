package ObjectClass;

public class child extends parent{
	int a =5;
	void mnk() {
		int a= 1;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println();
	}
	public static void main(String[] args) {
		int a = 2;
		
		child c = new child();
		c.mnk();
		
		
		
	
	}

}
