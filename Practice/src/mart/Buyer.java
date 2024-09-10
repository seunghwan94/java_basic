package mart;

import java.util.Arrays;

public class Buyer {
	private int money;
	private Product[] cart = new Product[3];
	private int cnt;
	
	
	public Buyer(int money) {
		this.money = money;
	}
	
	public void buy(Product p ) {
		if(cnt == cart.length) {
			cart = Arrays.copyOf(cart, cart.length * 2);
		}
		cart[cnt++] = p;
		System.out.println(Arrays.toString(cart));
	}
	
	public void purchase() {
		int sum = 0;
		String names = ""; 
		
		
		
		for (int i = 0; i < cnt; i++) {
			sum+=cart[i].getPrice();
			names += ", " + cart[i].getName();
		}
		names = names.replaceFirst(", ", "");
		
		
		int remain = money - sum;

		if(remain < 0) {
			System.out.println("결제 실패 : 잔액이 부족합니다.");
			return;
		}
		
		money = remain;
		System.out.println("당신이 구매한 상품은 " + names + " 입니다. ");
		System.out.println("남은 잔액은 : " + money);
		cnt = 0;
	}
}
