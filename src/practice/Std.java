package practice;

public class Std
{
	String sname;
	int age;
	int stand;
	
	public static void main(String[] args) {
		Std s1 = new Std();
		s1.sname = "a";
		s1.age= 12; 
		s1.stand = 1;
		
		System.out.println(s1.sname);
		System.out.println(s1.age);
		System.out.println(s1.stand);
		
		
		Std s2 = new Std();
		s2.sname = "b";
		s2.age= 12; 
		s2.stand = 1;
		
		System.out.println(s2.sname);
		System.out.println(s2.age);
		System.out.println(s2.stand);
		
		Std s3 = new Std();
		s3.sname = "c";
		s3.age= 12; 
		s3.stand = 1;
		
		System.out.println(s3.sname);
		System.out.println(s3.age);
		System.out.println(s3.stand);	}

}

