package practice;

public class java_jungsuk3 {
	public static void main(String[] args) {
		prac3_8();
	}
	
	public static void prac3_1(){
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 의 문자코드는
		
		System.out.println(1 + x << 33); 	//6
		System.out.println(y >= 5 || x < 0 && x > 2); // true
		System.out.println(y += 10 - x++); 	// 13 
		System.out.println(x+=2); 			// 5 => x++ 때문
		System.out.println( !('A' <= c && c <='Z') ); // false
		System.out.println('C'-c); 			// 2
		System.out.println('5'-'0'); 		// 5
		System.out.println(c+1); 			// 66
		System.out.println(++c); 			// B
		System.out.println(c++); 			// B
		System.out.println(c); 				// C
	} 
	
	public static void prac3_2(){
	/*
		아래의 코드는 사과를 담는데 필요한 바구니 버켓 의 수를 구하는 코드이다 만일 ( ) .
		사과의 수가 개이고 하나의 바구니에는 개의 사과를 담을 수 있다면 개의 바구니 123 10 , 13
		가 필요할 것이다 에 알맞은 코드를 넣으시오 . (1) .
	*/
		int numOfApples = 123; 	// 사과의 개수
		int sizeOfBucket = 10; 	// ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		int numOfBucket = 0; 	// 모든 사과를 담는데 필요한 바구니의 수
		
		// 3-1 1번 답
		numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0); 
		System.out.println("답 :"+numOfBucket);
		
		// 3-1 2번 답
		numOfBucket = (numOfApples + 9) / sizeOfBucket; 									 
		System.out.println("답 :"+numOfBucket);
				
	}
	public static void prac3_3(){

		//	아래는 변수 의 값에 따라 num ‘ ’, ‘ ’, ‘0’ 양수 음수 을 출력하는 코드이다 삼항 연산 .
		//	자를 이용해서 에 알맞은 코드를 넣으시오 (1) .

		int num = 10;
		String i = num > 0 ? "양수" : (num < 0 ? "음수" : "0");
		System.out.println(i); 
	}
	public static void prac3_4(){
		
		//	아래는 변수 의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num . num
		//	의 값이 ‘456’ ‘400’ , ‘111’ ‘100’ 이라면 이 되고 이라면 이 된다 에 알맞은 코드를 넣으 . (1)
		//	시오.
		
		int num = 456;
		System.out.println(num/100*100); 
	}
	public static void prac3_5(){
		
		//	아래는 변수 의 값 중에서 일의 자리를 로 바꾸는 코드이다 만일 변수 의 num 1 . num
		//	값이 이라면 이 되고 이라면 이 된다 에 알맞은 코드를 넣으시오 333 331 , 777 771 . (1) .
		
		int num = 333;
		System.out.println(num/10*10+1); 
	}
	public static void prac3_6(){
		
		//	아래는 변수 의 값보다 크면서도 가장 가까운 의 배수에서 변수 의 값을 num 10 num
		//	뺀 나머지를 구하는 코드이다 예를 들어 의 크면서도 가장 가까운 의 배수는 이 . , 24 10 30
		//	다 의 경우 이고 의 경우 이 된다 에서 를 뺀 나머지는 이기 때문에 변 . 19 20 , 81 90 . 30 24 6
		//	수 의 값이 라면 을 결과로 얻어야 한다 에 알맞은 코드를 넣으시오 num 24 6 . (1) .
		
		int num = 24;
		System.out.println(10 - num%10); 
	}
	
	public static void prac3_7(){
		
		// 아래는 화씨 를 섭씨 로 변환하는 코드이다 변환공식이 (Fahrenheit) (Celcius) . 'C =
		// 5/9 ×(F - 32)' , (1) . , 라고 할 때 에 알맞은 코드를 넣으시오 단 변환 결과값은 소수점
		// 셋째자리에서 반올림해야한다 를 사용하지 않고 처리할 것 .(Math.round() )

		int fahrenheit = 100;
		float celciusTmep = 5/9f * (fahrenheit - 32);
		float celcius = (int)(celciusTmep * 100 + 0.5)/100f;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
	
	public static void prac3_8(){
		
		//	아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		byte a = 10;
		byte b = 20;
		int c = a + b;
		char ch = 'A';
		ch = (char)((byte)ch+2);
		float f = 3 / 2;
		long l = 3000 * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
	}
	
	
}

