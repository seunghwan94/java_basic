package lesson18_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectOS {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		List<String> list = new ArrayList<String>(Arrays.asList("가","나","다"));
		List<Member> members = new ArrayList<Member>(Arrays.asList(new Member("홍길동",40),new Member("김길동",30),new Member("고길동",20)));
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
		oos.writeObject(members); // 
		System.out.println(oos);


		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
		List<Member> result = (List<Member>) ois.readObject();
		result.forEach(System.out::println);
	}
}

class Member implements Serializable{
	String name;
	transient int age; // 제외시키는 참고연산자
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Memeber [name=" + name + ", age=" + age + "]";
	}
	
}