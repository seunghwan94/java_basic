package lesson13_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// Vector : legacy Class
		// 요즘 잘 사용 안 한다.
		Vector<Double> vector = new Vector<>();
		
		// add, size, get
		vector.add(Math.PI);
		System.out.println(vector.size());
		System.out.println(vector.get(0));
		
		vector.addElement(Math.E);
		System.out.println(vector.elementAt(0));
		
		vector.removeElement(Math.PI);
		System.out.println(vector);

		// 복제 방법
		List<Double> list = new ArrayList<Double>(vector);
		System.out.println(list);
	}
}
