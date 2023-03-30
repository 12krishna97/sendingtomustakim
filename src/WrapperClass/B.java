package WrapperClass;

public class B {

	public static void main(String[] args) {
		Integer a=10;
		int b = a.intValue();//unboxing
		
		Character c='A';
		char c1 = c.charValue();//unboxing
		
		Double d1=10.5;
		double d2=d1;
		System.out.println(d2);//Auto -unboxing
		
		Short s=15;
		short s1=s;
		System.out.println(s1);//Auto -unboxing
	}
}
