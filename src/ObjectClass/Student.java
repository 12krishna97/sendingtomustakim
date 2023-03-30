package ObjectClass;

public class Student {
	String Fname;
	String Lname;
	int age;
	double per;

	public Student(String Fname, String Lname, int age, double per) {
		this.Fname = Fname;
		this.Lname = Lname;
		this.age = age;
		this.per = per;

	}

	public String toString() {
		return "first_name: " + Fname + '\n' + "Last_name: " + Lname + '\n' + "Age: " + age + '\n' + "Per: " + per;
	}

	public static void main(String[] args) {
		Student s1 = new Student("kitty", "gowda", 25, 60.12);
		Student s2 = new Student("ranju", "gowda", 30, 80.12);

		System.out.println(s1);

		System.out.println(s2);
	}

}
