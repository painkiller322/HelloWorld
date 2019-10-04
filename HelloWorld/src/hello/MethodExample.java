package hello;

import java.util.Scanner;

public class MethodExample {
	public static void main(String[] args) {// void는 리턴값없게

		int a = 50;
		System.out.println(args[0]);
		showName();// 매개값이 없는 메소드
		showAge(a);// 매개값이 하나인 메소드
		showMe(175.5, 65.8);// 매개값이 두개인 메소드

		int result1 = sum(4, 5);
		System.out.println("결과값1: " + result1);
		int result2 = minus(5, 3);
		System.out.println("결과값2: " + result2);
		int result3 = multi(5, 3);
		System.out.println("결과값3: " + result3);
		double result4 = devide(5, 3);
		System.out.println("결과값4: " + result4);

		Scanner sc = new Scanner(System.in);// 적정무게
		System.out.println("키 입력: ");
		double height = sc.nextDouble();
		System.out.println("적정몸무게: " + goodWeight(height));

		System.out.println(args[1]);
	}

	private static int sum2(int[] intAry) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int sum(int a, int b) {// a와 b를 합친 결과를 리턴하여 int타입으로
		return a + b;
	}

	public static int minus(int c, int d) {
		return c - d;
	}

	public static int multi(int e, int f) {
		return e * f;
	}

	public static double devide(double g, double h) {
		return g / h;
	}

	public static void showMe(double height, double weight) {// 정의하는 메소드에서만 데이텉타입(double)을 설정하면 됨
		System.out.println("I am " + height + " cm and " + weight + " kg");// 매개값을 받아서 이렇게 실행하겠다.
	}

	public static void showAge(int age) {
		System.out.println("I am " + age + " years old.");
	}

	public static void showName() {
		System.out.println("Hello, my name is BGJ.");
	}

	// 적정몸무게 :(키-100)*0.9
	public static double goodWeight(double height) {
		return (height - 100) * 0.9;
	}

	//
	
}
