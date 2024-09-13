package lesson12_api;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://t1.daumcdn.net/daumtop_deco/images/pctop/2023/logo_daum.png");
		
		FileOutputStream fos =new FileOutputStream("logo_daum.png");
		
		InputStream is =  url.openStream();
		int b = 0;
		while((b = is.read()) != -1) {
			fos.write(b);
			System.out.println(b);
		}
		fos.close();
		
	}
}
