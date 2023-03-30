package constructor;

public class Emp {
	int eid;
	String Ename;
	int sal;

	Emp(int eid, String Ename, int sal) {
		this.eid = eid;
		this.Ename = Ename;
		this.sal = sal;
		System.out.println(eid + " "+Ename+" "+sal);

	}

	public static void main(String[] args) {

		Emp e1 = new Emp(1, "krishna", 1000);
		Emp e2 = new Emp(2, "ranju", 2000);
		Emp e3 = new Emp(3, "burce", 3000);

	}

}
