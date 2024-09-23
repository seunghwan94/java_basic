package lesson18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class InputStreamEx2 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\test.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\tj\\Desktop\\test1.txt");
		System.out.println(fis.available()); // file 크기
		byte[] bytes = new byte[5];
		int i = 0;
		while((i = fis.read(bytes)) != -1) {
			System.out.println(new String(bytes, 0, i));
			System.out.println(Arrays.toString(bytes));
			fos.write(bytes, 0, i);
		}
		fis.close();
		fos.close();
	}
}
