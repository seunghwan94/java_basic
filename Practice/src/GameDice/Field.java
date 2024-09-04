package GameDice;

public class Field {
	int cnt = 0;
	int[][] field = new int[11][11];
	
	public void draw() {
		for (int i = -5; i < field[0].length - 5; i++) {
			for (int j = -5; j < field[1].length - 5; j++) {
//				System.out.printf("(%2d, %2d)", i, j);
				if (i==-5 || i == 5 || j== 5 || j==-5) {
					System.out.printf("(%2d, %2d, %2d)", cnt, i, j);
//					System.out.printf("%3s", "○");
				}else {
					System.out.printf("(%2s, %2s, %2s)", " "," ", " ");
//					System.out.printf("%3s"," ");
				}
				cnt++;
//				
			}
			System.out.println();
		}
	}
	
}
