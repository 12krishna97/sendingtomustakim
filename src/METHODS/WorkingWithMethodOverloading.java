package METHODS;

public class WorkingWithMethodOverloading {

	public static void m(int a) {
		System.out.println("method 1");
	}
	public static void m(int a,int b) {
		System.out.println("method 2");
	}
	public static void m(char a,double b) {
		System.out.println("method 3");
	}
	public static void m(double b,char a) {
		System.out.println("method 4");
	}
	public static void main(String[] args) {
		m(10);
		m(10,12);
		m('a',10.2);
		m(10.3,'b');
	}
}
