package WorkingWithFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File file=new File("Demo.txt");//naming the file
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is created");
		}
		else {
			System.out.println("file is already exist");
		}
		FileOutputStream fos=new FileOutputStream(file);
		String s="I live in Bangalore";
		fos.write(s.getBytes());
		
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
	}
	
} 
