package lesson13_collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.put("age", "40");
		properties.put("name", "홍길동");
		properties.put("gender", "man");
		
		System.out.println(properties);
		
		
		properties.store(new FileOutputStream("my.properties"), "#주석");
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("my.properties"));
		System.out.println(prop);
	}
}
