package Encapsulation;

public class Std {
	private String Sname;
	private int Sid;
	private int Semester;

	public Std(String Sname, int Sid, int semester) {
		this.Sname = Sname;
		this.Sid = Sid;
		this.Semester = semester;

	}

	// getter method
	public String getSname() {
		return this.Sname;
	}

	// setter method
	public void setSname(String Sname) {
		this.Sname = Sname;
	}

	public int getSid() {
		return this.Sid;
	}

	public void setSid(int Sid) {
		this.Sid = Sid;
	}

	public int getSemester() {
		return this.Semester;
	}

	public void setSemester(int Semester) {
		this.Semester = Semester;
	}
//	public String toString() {
//		return "sname:"+this.Sname+" "+"Sid:"+this.Sid+" "+"Semester:"+this.Semester;
//	}
}
