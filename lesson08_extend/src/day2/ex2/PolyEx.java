package day2.ex2;

public class PolyEx {
	public static void main(String[] args) {
		// 자식  = 자식 (인스턴스 생성)
		// 결국엔 자식를 가져오는거기 때문에 자식 메서드는 사용 가능
		// 자식이 부모를 extend 하기 떄문에 자식에 없고 부모만 가지고 있는 메서드는 사용 가능
		Child c = new Child();
		c.walk();
		c.run();
		c.eat();
		
		// 부모  = 자식 (인스턴스 생성)
		// 결국엔 부모를 가져오는거기 때문에 자식 메서드는 사용안된다.
		Parent p = new Child();
		p.walk();
		p.run();
//		p.eat();
		((Child)p).eat();
		
		Parent p2 = new Parent();
//		((Child)p2).eat();
		
		
//		Uncle u = new Child();
		Uncle u = new Uncle();
//		((Child)u).walk();
		
		if (p2 instanceof Parent) {
			System.out.println("p2 parent");
			
		}
		
		if (p2 instanceof Child) {
			System.out.println("p2 child");
		}
		
	}
}
