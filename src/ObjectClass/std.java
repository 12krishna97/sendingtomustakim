package ObjectClass;

public class std {
	String Sname;
	int age;
	double per;
	
	 std(String Sname,int age,double per) {
		 this.Sname=Sname;
		 this.age=age;
		 this.per=per;
	}
	public boolean equals(Object obj) {
		 std s=(std)obj;
		 if(this.age==s.age && this.Sname.equals(s.Sname) && this.per==s.per) {
			 return true;
		 }else {
			 return false;
		 }
		 
		 
	 }
	 public static void main(String[] args) {
		std a = new std("ram", 10, 65.9);
		std b = new std("sham", 20, 56.6);
		std c = new std("ram", 10, 65.9);
		
		System.out.println(a.equals(c));
	}

}
