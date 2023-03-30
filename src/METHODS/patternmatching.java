package METHODS;

public class patternmatching {
	public static void main(String[] args) {
		int star=1;
		int space=3;
		
		for (int k = 1; k <=4; k++) {
			for (int i = k; i <=space; i++) {
				System.out.print(" ");//3
			}
			for (int j = 1; j <=k; j++) {
				System.out.print("*");//1
			}
			System.out.println();
			
		}
	}

}
