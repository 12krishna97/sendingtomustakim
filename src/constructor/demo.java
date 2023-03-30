package constructor;

public class demo {
	demo(int a){
		System.out.println("hello");
	}demo(int a,int b){
		System.out.println("hi");
	}demo(int a,char b){
		System.out.println("how are you");
	}demo(int a,String b){
		System.out.println("hey whatsup");
	}
	
	public static void main(String[] args) {
		demo d1 = new demo(10);
		demo d2 = new demo(10,20);
		demo d3 = new demo(10,'a');
		demo d4 = new demo(10,"as");
		
	}

}
