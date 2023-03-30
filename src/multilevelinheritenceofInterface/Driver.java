package multilevelinheritenceofInterface;

public class Driver implements C,B,A {

	public void M() {
		System.out.println("hi");
	}

	public void m1() {
		System.out.println("zyz");
	}

	public void m3() {
		System.out.println("zync");
	}

	public void m4() {
		System.out.println("dinga");
	}

	public void M5() {
		System.out.println("managa");
	}

	public void m6() {
		System.out.println("penga");
	}

	public static void main(String[] args) {
	A a1=new Driver();
	a1.M();
	a1.m1();
	B b1=new Driver();
	b1.m3();
	b1.m4();
	
	C c1=new Driver();
	c1.M5();
	c1.m6();

	}
}
