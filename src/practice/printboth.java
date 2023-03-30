package practice;

public class printboth {
	public static void main(String[] args) {
		int i = 1;
		int even = 0;
		int odd = 1;

		while (i <= 30) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
			i++;
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
