package WorkingWithFileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Createanewfileandreadit {
	public static void main(String[] args) throws IOException {
		File file = new File("java.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("file is careated");
		} else {
			System.out.println("file alreday exists");
		}

		FileOutputStream fos = new FileOutputStream(file);
		String s1 = "hi how are you";
		fos.write(s1.getBytes());

		FileInputStream fis = new FileInputStream(file);
		int i = fis.read();
		while (i != -1) {
			System.out.print((char) i);
			i = fis.read();
		}
	}
}
