package workingWithString;

public class A {

	public static void main(String[] args) {
		String s=new String("Hello");//2 objects
		System.out.println(s);
		System.out.println(s.concat("All"));
		s=s.concat("All");
		System.out.println(s);
		
		String s1 = new String("good");//2 objects
		System.out.println(s1);
		System.out.println(s1.concat("bye"));
		System.out.println(s1);
		s1=s1.concat("bye");
		System.out.println(s1);
	}
}
