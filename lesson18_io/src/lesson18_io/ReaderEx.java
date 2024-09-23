package lesson18_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\tj\\Desktop\\test.txt");
//		FileWriter fw = new FileWriter("C:\\Users\\tj\\Desktop\\test1.txt"); 
		
		int c = 0;
		int cnt = 0;
		while ((c=fr.read()) != -1){
			System.out.println((char)c);
			System.out.println(cnt++ + "글자 읽음");
			
		}
		
		fr.close();
	}
}
