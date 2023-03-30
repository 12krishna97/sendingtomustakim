package practice;

public class sumevenusingforloop {
   
	public static void main(String[] args) {
		int even = 0;
		    int odd = 0;
		for (int i = 10; i <= 30; i++) {
			if(i%2==0)
			{
				even = even+i;
			}
			else
			{
				odd = odd+i;
			}
		}System.out.println(even);
		System.out.println(odd);

	}

}
