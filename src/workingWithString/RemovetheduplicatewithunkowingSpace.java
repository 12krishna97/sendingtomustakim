package workingWithString;

public class RemovetheduplicatewithunkowingSpace {
	public static void main(String[] args) {
		String s1 ="      aaaaabbbbbcccccddddfffff    llldddhhhhfff  ";
		String s2="";
		s1 = s1.replace(" ", "");
		System.out.println(s1);
		
		for(int i=0;i<s1.length();i++) {
			if(s2.indexOf(s1.charAt(i))==-1) {
				s2 += s1.charAt(i);
			}
		}System.out.println(s2);
	}

}
