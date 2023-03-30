package AcessingMemberOfOneClastoOther;

public class B {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.a);
		System.out.println(A.b);
		System.out.println(a1.b);
	}
}
