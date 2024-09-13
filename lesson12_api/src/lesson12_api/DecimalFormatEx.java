package lesson12_api;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx {
	public static void main(String[] args) throws ParseException {
		// format : 원시 > 문자열
		// parse  : 문자열 > 원시
		
		double[] scores = {90.555, 80.6666, 70.77777, 60.666666, 50.5};
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for (double d : scores) {
			System.out.println(df.format(d));
		}
		
		Number num = df.parse("9,999.99");
		double dou = num.doubleValue();
		System.out.println(num);
		System.out.println(dou);
		
	}
}
