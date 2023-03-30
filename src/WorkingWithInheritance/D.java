package WorkingWithInheritance;

public class D extends C{
int c;
public static void main(String[] args) {
	D d1=new D();
	System.out.println(d1.a);
	System.out.println(d1.b);
	System.out.println(d1.c);
	C c1=new C();
	System.out.println(c1.a);
	System.out.println(c1.b);
	
}
}
