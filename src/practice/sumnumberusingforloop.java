package practice;

public class sumnumberusingforloop {
	public static void main(String[] args) {
	
		int sum = 0;
	for(int num=576;num!=0;num=num/10) {
		int rem=num%10;
		sum=sum+rem;
	}
	System.out.println(sum);
		}
	}


