package ObjectClass;

import java.util.Objects;

public class Family {
	String father_name;
	String mother_name;
	int age;

	public Family(String father_name, String mother_name, int age) {
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		Family f2 = (Family) obj; // downcasting
		if (this.age == f2.age && this.father_name.equals(f2.father_name) && this.mother_name.equals(f2.mother_name)) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return Objects.hash(this.age, this.father_name, this.mother_name);

	}

	public static void main(String[] args) {
		Family f1 = new Family("venkatesh", "jaya", 45);
		Family f2 = new Family("venkatesh", "jaya", 45);
		Family f3 = new Family("brunda", "venu", 45);

		System.out.println(f1.equals(f2));
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());

		System.out.println(f1.equals(f3));
		System.out.println(f1.hashCode());
		System.out.println(f3.hashCode());
	}

}
