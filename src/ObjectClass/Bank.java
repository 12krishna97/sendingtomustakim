package ObjectClass;

public class Bank {

	String custName;
	String accNo;
	int age;
	public Bank(String custName, String accNo, int age) {
		
		this.custName = custName;
		this.accNo = accNo;
		this.age = age;
	}
	public boolean equals(Object obj) {
		Bank b=(Bank)obj;
		if(this.age==b.age && this.custName.equals(b.custName) && this.accNo.equals(b.accNo)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Bank b1=new Bank("Krishna","123ABC",27);
		Bank b2=new Bank("Krishna","123ABC",27);
		System.out.println(b1.equals(b2));
		Bank b3=new Bank("Prem","234abc",25);
		System.out.println(b2.equals(b3));
	}
	
}
