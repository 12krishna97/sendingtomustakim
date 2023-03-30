package break_continue_return;

public class demo1 {
	public static void main(String[] args) {
		int number = 10;
		while(number<=20) {
			if(number%6==0) {
				number++;
				System.out.println("number skipped");
				continue;
			}System.out.println(number);
			number++;
		}System.out.println("number skipped");
	}

}
