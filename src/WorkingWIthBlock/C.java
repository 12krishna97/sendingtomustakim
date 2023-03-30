package WorkingWIthBlock;

public class C {
C(){
	System.out.println("const 1");
}
{
	System.out.println("iib 1");
}
public static void main(String[] args) {
	System.out.println("main method");
	C c1=new C();
}
}
