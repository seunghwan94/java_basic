package shape;

import java.util.Arrays;
import shape.CommonUtils.*;

public class ShapeMain {
	public static void main(String[] args) {
		// 원, 사각형, 원기둥, 육면체 를 만들기
		// 원, 사각형 = 둘레(length)/넓이(aera) 계산
		// 원기둥, 육면체 = 부피(volume)/넓이 계산 
		// 다형성으로 하나의 배열로 관리 되어야 한다.
		Shape[] shape = new Shape[4];
		
		shape[0] = new Circle("원");
		shape[1] = new Square("사각형");
		shape[2] = new CirclePillar("원기둥");
		shape[3] = new Hexahedron("육각형");
		
		int r;
		int x;
		int y;
		int h;
		
		while(true) {
			
			int input = CommonUtils.nextInt("1.원  2.사각형  3.원기둥  4.육각형 5.종료");
			
			switch(input){
			case 1:
				r = CommonUtils.nextInt("반지름의 길이를 작성하세요");
				((Circle) shape[0]).setR(r);
				break;
			case 2:
				x = CommonUtils.nextInt("가로 길이를 작성하세요");
				y = CommonUtils.nextInt("세로 길이를 작성하세요");
				((Square) shape[1]).setXY(x,y);
				break;
			case 3:
				r = CommonUtils.nextInt("원의 반지름의 길이를 작성하세요");
				h = CommonUtils.nextInt("원의 반지름의 길이를 작성하세요");
				((CirclePillar) shape[2]).setData(r,h);
				break;
			case 4:
				x = CommonUtils.nextInt("가로 길이를 작성하세요");
				y = CommonUtils.nextInt("세로 길이를 작성하세요");
				h = CommonUtils.nextInt("높이를 작성하세요");
				((Hexahedron) shape[3]).setData(x,y,h);
				break;
			}
			
			if(input == 5) {
				System.out.println("종료!");
				break;
			}
			
			System.out.println(shape[input - 1]);
		
			
//			for (Shape i : shape) {
//				System.out.println(i);	
//			}
			
		}

		
		
		
		
	}
}
