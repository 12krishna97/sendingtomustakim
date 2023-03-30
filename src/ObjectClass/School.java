package ObjectClass;

import java.util.Objects;

public class School {
String studentName;
double std;
int rollNo;
public School(String studentName, double std, int rollNo) {
	super();
	this.studentName = studentName;
	this.std = std;
	this.rollNo = rollNo;
}
public boolean equals(Object obj) {
	School s=(School)obj;
	if(this.std==s.std && this.rollNo==s.rollNo && this.studentName.equals(s.studentName)) {
		return true;
	}
	else {
		return false;
	}
}
public int hashCode() {
	return Objects.hash(this.studentName,this.std,this.rollNo);
}
public static void main(String[] args) {
	School s1=new School("Krishna",5,1);
	School s2=new School("Krishna",5,1);
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	School s3=new School("Prem",4, 2);
	System.out.println(s2.equals(s3));
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	
}
}
