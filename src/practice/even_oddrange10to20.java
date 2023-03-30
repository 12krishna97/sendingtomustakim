package practice;

public class even_oddrange10to20 
{

	public static void main(String[] args) {
		int a = 10;
		int esum=0;
		while(a<=20)
		{
			if(a%2==0) {
				esum=esum+a;
			}
			a++;
		}
		System.out.println(esum);
	}
}
