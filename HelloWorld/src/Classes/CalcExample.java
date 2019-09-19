package Classes;

import java.util.Scanner;

public class CalcExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1째값 입력: ");
		int a = sc.nextInt();
		System.out.print("2째값 입력: ");
		int b = sc.nextInt();

		Calculator cal = new Calculator();
		cal.execute(a, b);
	}
}