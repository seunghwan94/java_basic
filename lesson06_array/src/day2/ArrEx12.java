package day2;

public class ArrEx12 {
	public static void main(String[] args) {
		String[][] addrs = {
								{"홍길동","고길동"},
								{"서울","제주"},
								{"001","002","003"}
							};
		for (int i = 0; i < addrs.length; i++) {
			for (int j = 0; j < addrs[i].length; j++) {
				System.out.print(addrs[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
