package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WorkingWithThrows {

	public static void m() throws FileNotFoundException,ArrayIndexOutOfBoundsException {
		FileInputStream fis=new FileInputStream("c://abc.txt");
	}
	
	public static void main(String[] args) throws FileNotFoundException,ArrayIndexOutOfBoundsException {
		m();
	}
}
