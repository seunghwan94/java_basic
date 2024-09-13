package lesson12_api;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = new Integer(20);
		Integer i3 = new Integer("30");
		
		System.out.println(i1 + i2 + i3); // unboxing;
		
		Integer i4 =20;
		System.out.println(i2 == i4);
		System.out.println(i2.equals(i4));
		System.out.println(i2.intValue() == i4.intValue());
		
		Long l1 = 10L; // boxing
		Long l2 = i1.longValue();
		Character c1 = 65; // A

		// 문자열 > wrapper 객체
		l2 = Long.valueOf("10"); //일반적으로 이거 사용
		l2 = new Long("10");
		// wrapper > 문자열
		String str1 = l2.toString(); // l2가 null만 아니면 무조건 가능
		String str2 = l2 + ""; 
		
		// 기본형 > wrapper
		l2 = Long.valueOf(10L); //일반적으로 이거 사용
		// wrapper > 기본형
		long l3 = l2.longValue();
		
		
		// 기본형 > 문자열
//		l3 = String.valueOf(l3);
		// 문자열 > 기본형
		l3 = Long.parseLong(str2); 
		
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toString(255));
		
		System.out.println(Integer.toHexString(255));
		char ch = 0xAC00;
		System.out.println(ch);
		
		
	}
}
