package lesson03_variable;

public class ScopeEx {
	public static void main(String[] args) {
		char ch = '가';
		{
			int num = 10;
			System.out.println(num);
			System.out.println(ch);
			{
				// num?
				// ch?
			}
		}
//		System.out.println(num);
		
	}
}
