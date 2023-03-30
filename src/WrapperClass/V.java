package WrapperClass;

public class V {

	public static void main(String[] args) {
	String s="ELF28JAN25";
	char c []=s.toCharArray();
	int sum=0;
	for(int i=0;i<c.length;i++) {
		
		if(c[i]>='0' && c[i]<='9') {
			sum=sum+Integer.parseInt(c[i]+"");
		}
	}
	System.out.println(sum);
		
				
	}
}
