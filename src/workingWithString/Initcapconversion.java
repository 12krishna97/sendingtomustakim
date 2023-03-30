package workingWithString;

public class Initcapconversion {
	
	public static void main(String[] args) {
		String s = "krishna";
		
		//method one
		s= s.substring(0,1).toUpperCase() + s.substring(1, s.length());
		System.out.println(s);
		
		//second method 
		
		String First_letter = s.substring(0, 1);
		String Remain = s.substring(1, s.length());
		
		First_letter =First_letter.toUpperCase();
		
		System.out.println(First_letter + Remain);
		
	}

}
