package lesson05_control;

public class SwitchEx2 {
	public static void main(String[] args) {
		String addr = "서울";
		System.out.printf("저희 집은 %s 입니다.\n", addr);
		switch (addr) {
			case "서울":
				System.out.printf("저희 집은 %s\n", addr);
				break;
			case "제주":
				System.out.printf("저희 집은 %s\n", addr);
				break;
			default:
				System.out.printf("저희 집은 주소없음 ");
		}
	}
}
