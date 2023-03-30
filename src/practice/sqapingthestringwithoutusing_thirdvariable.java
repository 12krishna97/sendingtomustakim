package practice;

public class sqapingthestringwithoutusing_thirdvariable {
public static void main(String[] args) {
	String a = "hello";
	String b = "word" ;
	System.out.println("before swaping the values: a="+a  +" and b="+b);
	a=a+b;//append the value output now values of a will be a="helloword"
	
	b=a.substring(0, a.length()-b.length()); // a string will be 
	
	a=a.substring(b.length());
	
	System.out.println("after swaping the values: a="+a  +" and b="+b);
	
	
	
}
}
