package hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("Input int type"); int a = sc.nextInt();
		 * System.out.println("next input"); int b = sc.nextInt();
		 * System.out.println("next input"); int c = sc.nextInt(); int sum = a + b + c;
		 * System.out.println("합은: " + sum);
		 */
		// 반복문 쓰기
		int[] intAry = new int[5];
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("Input value");
			int a = sc.nextInt();
			intAry[i] = a;
		}
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i];
		}
		System.out.println("입력값의 합은: " + sum);
	}
}
