package workingWithString;

public class removeduplicatevalueswithsplittingcahr {
	public static void main(String[] args) {
		String s = "hello hey hello how are you";
		String[] s1 = s.split(" ");
		String s2 = "";

	for(int i=0;i<s1.length;i++) {
		if(!s2.contains(s1[i])) {
			s2=s2+s1[i]+" ";
		}
	}
	s2=s2.trim();
	System.out.println(s2);
		}
	}

