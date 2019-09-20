package hello;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("금액입력: ");
//		int a = sc.nextInt();
//		System.out.println("5만원: " + a / 50000);
//		System.out.println("1만원: " + (a % 50000) / 10000);
//		System.out.println("5천원: " + ((a % 50000) % 10000) / 5000);
//		System.out.println("1천원: " + (((a % 50000) % 10000) % 5000) / 1000);
//		System.out.println("5백원: " + ((((a % 50000) % 10000) % 5000) % 1000) / 500);
//		System.out.println("1백원: " + (((((a % 50000) % 10000) % 5000) % 1000) % 500) / 100);
//		System.out.println("5십원: " + ((((((a % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50);
//		System.out.println("1십원: " + (((((((a % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10);

		int[] exc = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.print("금액입력: ");
		int money = sc.nextInt();
		for (int i = 0; i < exc.length; i++) {
			System.out.println(exc[i] + "원은: " + money / exc[i]);
			money %= exc[i];
		}
	}
}
