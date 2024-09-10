package lesson10_inner;

public class InnerTest {
	public static void main(String[] args) {
		Outer.Inner outer = new Outer().new Inner();
		Outer.Sinner sinner = new Outer.Sinner();
	}
}
class Outer {
	int i1;
	static int si1;
	
	class Inner{
		int i2;
		static int si2;
		{
			System.out.println(i1);
		}
	}
	
	static class Sinner{
		int i3;
		static int si3;
		{
//			System.out.println(i1);
			System.out.println(i3);
		}
	}
	
}