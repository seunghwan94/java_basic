package test2;

import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.DAY_OF_WEEK;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

		
		Calendar cal = Calendar.getInstance();//start
		Calendar cal2 = Calendar.getInstance();//end
		
		cal.add(5, -43);
		System.out.println(sdf.format(cal.getTimeInMillis())); // 1997-04-28		
		cal2.add(5, -13);
//		cal2.add(5, -); // end
		
		System.out.println(sdf.format(cal2.getTimeInMillis())); // 1997-04-28	
		
		int startDay = cal.get(DAY_OF_WEEK);
		int endDay = cal2.get(DAY_OF_MONTH);
		
		int cnt = 0;
		
		System.out.printf("%2s %1s %1s %1s %1s %1s %1s","일","월","화","수","목","금","토");
		System.out.println();
//		
		for (int i = 1 - startDay; i <= endDay; i++) {
			
			if (i > 0) {
				System.out.printf("%3d",i);	
			}else {
				System.out.printf("%3c",' ');
			}
			
			if (cnt % 7 == 0) {
				System.out.println();
			}
				
			cnt++;
			
		}
		
		
		
		
		
//		Test2 test = new Test2(null);
//		test.a();
//		test.b();
//		System.out.println(test);
//		
	}

}
abstract class Test {
	String name;

	public Test(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	abstract void a();
	abstract void b();

	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}

}


class Test2 extends Test {

	public Test2(String name) {
		super("테스트다");
		// TODO Auto-generated constructor stub
	}

	@Override
	void a() {
		// TODO Auto-generated method stub
		System.out.println("aaaaa");
	}

	@Override
	void b() {
		// TODO Auto-generated method stub
		System.out.println("bbbbb");
	}
	
	
}