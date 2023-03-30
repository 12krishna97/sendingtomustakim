package METHODS;

public class demo1 {
	public static void main(String[] args) {
		int space = 3;
		int num =1;
		
		for(int i=1;i<=4;i++) {
			for(int row=1;row<=space;row++) {
				System.out.print(" ");	
			}for(int col=1;col<=num;col++) {
				System.out.print(col);		
		}System.out.println();
		space--;
		num++;
	}
}
}