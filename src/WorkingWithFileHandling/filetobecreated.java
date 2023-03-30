package WorkingWithFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filetobecreated {
	public static void main(String[] args) throws IOException {
		File f = new File("sql.txt");
		if (!f.exists()) {
			f.createNewFile();
			System.out.println("file has been created scucessfully");
		} else {
			System.out.println("file is already exists");
		}

		FileOutputStream fos = new FileOutputStream(f);
		String s = "hi baby";
		fos.write(s.getBytes());

		FileInputStream fis = new FileInputStream(f);
		int i = fis.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fis.read();
		}
	}

}
