package multipleInhertencebyusingInterface;

public class C implements A,B{
	public void Method() {
		System.out.println("hi");
	}
	public void method1() {
		System.out.println("hello");
	}
public static void main(String[] args) {
	A a= new C();
	
	a.Method();
	System.out.println();
	B b = new C();
	b.method1();
}
}
