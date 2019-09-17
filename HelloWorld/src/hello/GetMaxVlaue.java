package hello;

import java.util.Scanner;
//정수값 반복입력, 입력값들을 비교하여 큰수 고르기
public class GetMaxVlaue {
	public static void main(String[] args) {
		int[] intAry = new int[5];
		int result = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < intAry.length; i++) {
			System.out.println("정수값 입력");
			intAry[i] = sc.nextInt();
		}
		int maxValue = 0;
		for (int i = 0; i < intAry.length; i++) {
			maxValue = (maxValue > intAry[i] ? maxValue : intAry[i]);
		}
		System.out.println("다섯중에 큰 수는: " + maxValue);
	}
}