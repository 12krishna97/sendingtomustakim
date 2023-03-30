package workingWithString;

import java.util.Scanner;

public class removetheduplicateinscanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		String a = sc.nextLine();
		a=a.replace(" ","");
		
	char c[]=a.toCharArray();
	String s="";
	for(int i=0;i<c.length;i++) {
		if(s.indexOf(c[i])==-1) {
			s=s+c[i];
		}
		
	}
	System.out.println(s);
	}

}
