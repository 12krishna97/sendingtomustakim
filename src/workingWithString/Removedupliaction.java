package workingWithString;

public class Removedupliaction {
	public static void main(String[] args) {
		String s = "aabbccddff";
		String s1 = "";
		for(int i=0;i<s.length();i++) {
			if(s1.indexOf(s.charAt(i))==-1) {
				s1 += s.charAt(i); 
			}
		}System.out.println(s1);
	}

}
