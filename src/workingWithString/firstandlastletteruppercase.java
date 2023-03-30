package workingWithString;

public class firstandlastletteruppercase {
	public static void main(String[] args) {
		String s1 ="krishna";
	s1=s1.substring(0, 1).toUpperCase() + s1.substring(1, s1.length()).toLowerCase() + s1.substring(s1.length()-1).toUpperCase();
		System.out.println(s1);
	}

}
