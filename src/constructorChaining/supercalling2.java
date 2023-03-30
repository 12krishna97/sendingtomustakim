package constructorChaining;

public class supercalling2 extends supercalling1{
	public supercalling2() {
		super(10);
		System.out.println("const-5");
	}
	supercalling2(int a){
		super(15);
		System.out.println("const-6");
	}

}
