package ArrayOfObjects;

import java.util.Scanner;

public class College {

	String sname;
	double perc;
	int semester;
	public College(String sname, double perc, int semester) {
		
		this.sname = sname;
		this.perc = perc;
		this.semester = semester;
	}
	//overriding toString()
	public String toString() {
		return "Name:"+this.sname+" "+"Perc:"+this.perc+" "+"Semester:"+this.semester;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		College data[]=new College[size];
		
	   for(int i=0;i<data.length;i++) {
		   System.out.println("Enter the name");
		   String sname=sc.next();
		   System.out.println("enter the perc");
		   double perc=sc.nextDouble();
		   System.out.println("enter the semester");
		   int semester=sc.nextInt();
		   data[i]=new College(sname, perc, semester);
	   }
	   for(int i=0;i<data.length;i++) {
		   System.out.println(data[i]);
	   }
	   
	   
	}
	
}
