package abstraction;

public class Z extends Y {
	
	void M1() {
		System.out.println("hi");
	}
	void M2() {
		System.out.println("hello");
	}
public static void main(String[] args) {
	X x = new Z();
	
	x.M();
	x.M1();
	
	Y y=new Z();
	y.M2();
	y.m3();
	
}
}
