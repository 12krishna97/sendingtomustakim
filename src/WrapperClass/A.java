package WrapperClass;

public class A {

	public static void main(String[] args) {
		int a=10;
		Integer b = Integer.valueOf(a);
		System.out.println(b);//boxing
		
		char c='a';
		Character d = Character.valueOf(c);//boxing
		System.out.println(d);
		
		double d1=10.2;
		Double d2=d1;//Auto boxing
		System.out.println(d2);
		
		byte b1=12;
		Byte b2=b1;
		System.out.println(b2);
	}
}
