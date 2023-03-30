package Encapsulation;

public class Driver {

	public static void main(String[] args) {
		Bank b=new Bank("Krishna",123,20000);
		System.out.println(b.getAccNo());
		b.setAccNo(235);
		System.out.println(b.getAccNo());
	}
}
