package practice;

public class divisible {
	public static void main(String[] args) {
		int i = 10;
		int sum = 0;
		
		while(i<=30)
		{
			if(i%3 == 0)
			{
				sum = sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
