package constructorChaining;

public class supercalling1 extends supercalling {
	public supercalling1() {
		super(5);
System.out.println("const-3");
	}
	supercalling1(int a){
		System.out.println("const-4");
	}

}
