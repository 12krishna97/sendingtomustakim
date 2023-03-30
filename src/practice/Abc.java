package practice;

public class Abc {
	public static void main(String[] args) {
		int a = 10;
		int b =12;
		int c = 11;
		
		int abc = (a>b)? ((a>c)?a:c):((b>c)?b:c);
		System.out.println(abc);
	}

}
