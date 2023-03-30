package METHODS;

public class Pattern {

	public static void main(String[] args) {
		int k=64;
		for(int  row=1;row<=4;row++) {
			for(int space=row;space<=3;space++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				char c=(char)(col+k);
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
