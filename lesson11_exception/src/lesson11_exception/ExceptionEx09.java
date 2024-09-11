package lesson11_exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionEx09 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try(FileOutputStream fos1 = new FileOutputStream("1.txt")){
			byte[] bs = {'a','b','c','d','e'};
			fos1.write(bs);
		}catch (IOException e ) {
			e.printStackTrace();
		}
		
		
		
		
//		try {
//			fos = new FileOutputStream("1.txt");
//			byte[] bs = {'a','b','c','d','e'};
//			fos.write(bs);
//		}catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {				
//				fos.close();
//			}catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}
}


