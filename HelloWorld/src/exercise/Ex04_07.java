package exercise;

import java.util.Scanner;

public class Ex04_07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("---------------------------");
			System.out.print("선택> ");

			// 작성위치
			int num = sc.nextInt();

			if (num == 1) {
				System.out.print("예금 입력: ");
				balance += sc.nextInt();
			} else if (num == 2) {
				System.out.print("출금 입력: ");
				balance -= sc.nextInt();
			} else if (num == 3) {
				System.out.print("잔고 입력: ");
				System.out.println(balance);
			} else if (num == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
