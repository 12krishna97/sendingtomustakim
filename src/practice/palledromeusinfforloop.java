package practice;

public class palledromeusinfforloop {
	public static void main(String[] args) {
		int reverse = 0 ;
		int number = 121;
		for(int num =number;num!=0;num =num/10) {
			int rem = num%10;
			reverse = reverse*10+rem;
		}
		if(number==reverse) {
			System.out.println("say pallandrome");
		}else {
			System.out.println("not pallandrome");
		}
	}

}
