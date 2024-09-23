package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamEx {
	public static void main(String[] args) throws IOException {
		// EOF : End of file
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\test1.txt");
		int i = 0;
		int cnt = 0;
		while((i = fis.read()) != -1) {
			System.out.println((char)i + " : " + i);
			cnt++; 
			fos.write(i);
		}
		System.out.println(fis.read());
		System.out.println(cnt + " byte");
		fis.close();
		fos.close();
		
		
	}
}
