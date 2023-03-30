package ArrayOfObjects;

public class Student {

	String sname;
	int rollNo;
	double perc;
	public Student(String sname, int rollNo, double perc) {
		
		this.sname = sname;
		this.rollNo = rollNo;
		this.perc = perc;
	}
	public static void main(String[] args) {
		Student s=new Student("Krishna",1,90);
		Student s1=new Student("Sharoon",2,89);
		Student s2=new Student("Prem",3,88);
		
		Student data[]= {s,s1,s2};
		for(int i=0;i<data.length;i++) {
			System.out.println("Name:"+data[i].sname+" "+data[i].rollNo+" "+data[i].perc);
		}
		
	}
	
}
