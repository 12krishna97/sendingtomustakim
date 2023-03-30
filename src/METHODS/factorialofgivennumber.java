package METHODS;

public class factorialofgivennumber {
 
	public int method(int a) {
		 int fact = 1;
	for(int  i=1;i<=a;i++) {
	fact= fact*i;
	}
	return fact;
 }
	public static void main(String[] args) {
		factorialofgivennumber f1 = new factorialofgivennumber();
		int b = f1.method(4);
		System.out.println(b);
		
	}

}
