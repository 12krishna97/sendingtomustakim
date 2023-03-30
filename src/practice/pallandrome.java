package practice;

public class pallandrome {
	public static void main(String[] args) {
		int num = 223;
		int reverse = 0;
		int real_number=num;
		
		
		while(num!=0) {
			int rem  = num%10;//to fetch last value
			reverse = reverse*10+rem;//
			num = num/10;
		}
		if(real_number==reverse) {
			System.out.println("it's an pallendrome");
		}else {
			System.out.println("it's an not pallendrome");
		}
	}

}
