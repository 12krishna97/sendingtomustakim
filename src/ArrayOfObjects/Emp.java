package ArrayOfObjects;

public class Emp {
String ename;
double salary;
int eid;
static int count;
public Emp(String ename, double salary, int eid) {
	
	this.ename = ename;
	this.salary = salary;
	this.eid = eid;
	count++;
}
public static void main(String[] args) {
	Emp e1=new Emp("Krishna",30000,1);
	Emp e2=new Emp("Sharoon",29000,2);
	Emp e3=new Emp("Prem",28000,3);
	
	Emp data[]=new Emp[count];
	data[0]=e1;
	data[1]=e2;
	data[2]=e3;
	
	for(int i=0;i<data.length;i++) {
		System.out.println("Name:"+data[i].ename+" "+"Salary:"+data[i].salary+" "+data[i].eid);
	}
}
}
