package mart;


import static mart.CommonUtils.*;

public class MartMain {
	public static void main(String[] args) {

		Buyer buyer = new Buyer(500);
		
		while(true) {
			int input = nextInt("1.상품 선택  2.결제하기");
			switch (input) {
				case 1:
					int i2 = nextInt("1.Tv  2.Aircon  3.computer");
					
					switch (i2) {
						case 1:
							buyer.buy(new Tv());
							break;
						case 2:
							buyer.buy(new AirCon());
							break;
						case 3:
							buyer.buy(new Computer());
							break;
						default:
							break;
					}
					break;
				case 2:
					buyer.purchase();
					break;
				default:
					break;
			}
		
		}
	}
}
