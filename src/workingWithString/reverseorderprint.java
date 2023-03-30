package workingWithString;

public class reverseorderprint {
	public static void main(String[] args) {
		String s = "hello how are you";
		String []s1 = s.split(" ");
		String rev=" ";
		for(int i=s1.length-1;i>=0;i--) {
			rev=rev+s1[i]+" ";
		}
		rev=rev.trim();
		System.out.println(rev);
	}

}
