package WorkingWIthBlock;

public class A {
static int a=10;
static {
	a=20;
}
static {
	a=30;
}
	public static void main(String[] args) {
		System.out.println(a);
	}
}
