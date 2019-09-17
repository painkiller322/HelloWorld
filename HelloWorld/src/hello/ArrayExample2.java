package hello;

public class ArrayExample2 {
	public static void main(String[] args) {
		int[][] intA = { { 2, 3, 4 }, { 5, 6, 7 } };//int[2][3]
		// 1행:| 2 | 3 | 4 |
		// 2행:| 5 | 6 | 7 | 모양의 배열을 구성
		for (int i = 0; i < intA.length; i++) {
			for (int j = 0; j < intA[i].length; j++) {
				System.out.print("[" + i + "," + j + "->"+intA[i][j]+"]");
			}
			System.out.println();
		}
	}
}
