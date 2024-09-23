package lesson18_io;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class DataInOutEx {
	public static void main(String[] args) throws IOException {
		System.out.println(Math.PI);
		// 텍스트 파일
		// 원주율값 저장 관리
		
		// 1. 데이터를 파일로 저장
		FileWriter fw = new FileWriter("C:\\Users\\tj\\Desktop\\test2.txt");
		String pi = Math.PI + "";
//		char[] pis = pi.toCharArray();
		fw.write(pi);
		fw.close();
		
		// 2. 파일로 저장된 데이터를 읽어와서 확인
		FileInputStream fis = new FileInputStream("C:\\Users\\tj\\Desktop\\test2.txt");
		byte[] bs = fis.readAllBytes();
		String s = new String(bs);
		System.out.println(s);
		
	}
}
