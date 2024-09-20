package lesson14_generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GenericEx6 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
		Class<GenericEx6> cls = GenericEx6.class;
//		Method[] methods =  cls.getMethods();
		Method[] methods =  cls.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
			if(m.getName().equals("test")) {
				m.invoke(new GenericEx6(),null);
			}
		}
		
		GenericEx6 ex6 = cls.newInstance();
		ex6.test();
		GenericEx6.getT(10);
		
	}
	void test() {
		System.out.println("test!!!!");
	}
	static <T> T getT(T t) {
		return t; 
	}
}
