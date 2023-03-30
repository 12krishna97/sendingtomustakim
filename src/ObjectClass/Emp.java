package ObjectClass;

public class Emp{
String ename;
double salary;
int eid;
public Emp(String ename, double salary, int eid) {
	this.ename = ename;
	this.salary = salary;
	this.eid = eid;
}
//overriding toString()
public String toString() {
	return "Name:"+this.ename+" "+"Salary:"+this.salary+" "+"Eid:"+this.eid;
}
public static void main(String[] args) {
	Emp e1=new Emp("Krishna",30000,1);
	Emp e2=new Emp("Prem",25000,2);
	System.out.println(e1);
	System.out.println(e2);
	

}
}
