package ObjectClass;

public class A {
	double salary;
	
public A(double salary) {
		super();
		this.salary = salary;
	}

public static void main(String[] args) {
	A a1=new A(10);
	A a2=new A(10);
	System.out.println(a1.equals(a2));
	System.out.println(a1.hashCode());
	System.out.println(a2.hashCode());
	A a3=a2;
	System.out.println(a3.equals(a2));
	System.out.println(a3.hashCode());
	System.out.println(a2.hashCode());
	
}
}
