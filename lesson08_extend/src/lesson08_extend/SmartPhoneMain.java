package lesson08_extend;

public class SmartPhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone("전화기", "화이트", "현대");
		
		System.out.println(phone);
		phone.call();
		phone.receive();
		
		SmartPhone sp = new SmartPhone("갤럭시", "블랙", "삼성");
		
		System.out.println(sp);
		sp.call();
		sp.receive();
		sp.installApp();
	}
}
