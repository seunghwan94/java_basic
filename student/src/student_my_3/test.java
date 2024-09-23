package student_my_3;

public class test {
	public static void main(String[] args) {
		int i = StudentUtils.next("숫자",Integer.class, t-> t<0, "0보다 큰값");
		System.out.println(i);
	}
}
