package break_continue_return;

public class break_statment {
	public static void main(String[] args) {
		int num = 1;
		while (num <= 10) {

			if (num == 5) {

				break;
				
			}
			System.out.println(num);
			num++;
		}
		System.out.println("bye");
	}

}
