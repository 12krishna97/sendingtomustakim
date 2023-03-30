package Interface;

public class D implements C{
public void a1() {
	System.out.println("method 1");
}
public void a2() {
	System.out.println("method 2");
}
public static void main(String[] args) {
	C c1=new D();
	c1.a1();
	c1.a2();
}
}
