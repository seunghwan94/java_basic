package shape;

import java.util.Arrays;

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
		
		((Circle) shape[0]).setR(2);
		((Square) shape[1]).setXY(5,5);
		((CirclePillar) shape[2]).setData(2,2);
		((Hexahedron) shape[3]).setData(3,4,5);
		for (Shape i : shape) {
			System.out.println(i);	
		}
		
		
	}
}
