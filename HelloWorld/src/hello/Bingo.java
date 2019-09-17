package hello;

public class Bingo {
	public static void main(String[] args) {
//5x5열에 숫자를 순서대로 자동으로 넣기
//		int[][] intb = new int[5][5];
//		int b = 1;
//		for (int i = 0; i < intb.length; i++) {
//			for (int j = 0; j < intb.length; j++) {
//				intb[i][j] = b++;
//				System.out.printf("%3d", intb[i][j]);
//			}
//			System.out.println();
//		}
//	}
//숫자배열 바꾸기	
	{
		int[][] intb = new int[5][5];
		int b = 1;
		for (int i = 4; i >=0; i--) {
			for (int j = 0; j < intb[i].length; j++) {
				intb[i][j] = b++;
				System.out.printf("%3d", intb[j][i]);
			}
			System.out.println();
		}
	}
}
}
