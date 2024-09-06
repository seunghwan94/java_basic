package lesson07_oop;

import java.util.Arrays;

public class MyData {
	public static void main(String[] args) {
		Data[] datas = new Data[2];
		
		datas[0] = new Data(); 
		datas[0].no = 1;
		datas[0].name = "길동이";
		datas[0].addr = "경기";

		datas[1] = new Data(); 
		datas[1].no = 2;
		datas[1].name = "개길이";
		datas[1].addr = "서울";
		
		for (Data d : datas) {	
			System.out.println(d.name);
			
		}
		
		
		
//		datas[0] = 
		
	}
}
class Data{
	int no;
	String name;
	String addr;
}
