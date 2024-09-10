package lesson09_interface_ex;

@UserAnnon(value = "hey")
public class UserClass {
	
	
	@UserAnnon("test")
	void m() {
		
	}
	// 어노테이션 value가 배열일 경우 사용방법
	@UserAnnon({"ㄴㄴ","ㄷㄷ"})
	void m2() {
		
	}
}
