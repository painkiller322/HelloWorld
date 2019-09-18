package hello;

import java.util.Scanner;

//달력만들기
public class MethodExample3 {
	//보내기
	public static void main(String[] args) {
		showCal(10);
	}
	
	public static void showCal(int mon) {
	String[] week = { "Sun", "Mun", "Tue", "Wed", "Thu", "Fri", "Sat" };
	int month = mon;
	int monthDay = getMonthday(month);
	int sDay = getStartday(month);
	System.out.println("          <<"+month+"월>>          ");
	// 요일 타이틀 출력
	for (int i = 0; i < week.length; i++) {
		System.out.print(" " + week[i]);
	}
	System.out.println();
	// 1일의 위치지정
	for (int i = 1; i < sDay; i++) {
		System.out.printf("%4s", "");
	}
	for (int i = 1; i <= monthDay; i++) {
		System.out.printf("%4d", i);
		if ((sDay + i - 1) % 7 == 0)
			System.out.println();
	}
}

	public static int getStartday(int month) {
		int startDay = 0;
		if (month == 9) {
			startDay = 1;// 일요일.
		} else if (month == 10) {
			startDay = 3;// 화요일.
		} else if (month == 11) {
			startDay = 6;// 금요일.
		} else if (month == 8) {
			startDay = 5;// 목요일.
		}
		return startDay;
	}

	// 각 달의 마지막날짜보기
	public static int getMonthday(int month) {
		int day = 0;
		if (month == 2) {
			day = 28;
		} else if (month <= 7 && month % 2 == 1) {
			day = 31;
		} else if (month >= 8 && month % 2 == 0) {
			day = 31;
		} else {
			day = 30;
		}
		return day;
	}

//		
//		int[] intAry = { 1, 2, 3, 4, 5 };
//		int sum = 0;
//		for (int i = 0; i < intAry.length; i++) {
//			sum = sum + intAry[i];
//
//		System.out.println("합은: " + sum);
//	}
//
//	int[] intAry2 = { 1, 2, 3, 4, 5, 6 };
//	sum=sumArray(intAry2);
//		System.out.println("합은: "+ sum);
//					}
//
//	int[] intAry3 = { 1, 2, 3 };
//	sum=sumArray(intAry3);
//	System.out.println("합은: "+ sum);
//}

//		printStar(); 프린트스타

//		int[] ary = showArray1(1, 2, 3, 4, 5);
//		for (int i = 0; i < ary.length; i++) {
//			System.out.println(ary[i]);
//		}
//		// 배열의 경우, 위의 for문과 print를 간결하게하는 enhanced for
//		for (int a : ary) {// ary중 하나를 담고 반복해서 계속 담고 찍어줵ㅆ다.
//			System.out.println(a);
//		}
//	}

	// 매개값을 받아서 배열에 넣어 리턴
	public static int[] showArray(int... arg) {
		int[] aAry = new int[arg.length];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] = arg[i];
		}
		return aAry;
	}

	public static int[] showArray1(int a, int b, int c, int d, int e) {
		int[] ary = { a * 2, b * 2, c * 2, d * 2, e * 2, };
		return ary;

	}

//printStar(7,5)크기로 내용물은*로
//	public static void printStar(int a, int b) {
//		for (int j = 0; j < b; j++) {
//			for (int i = 0; i < a; i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}

//printStar(N) 숫자 지정해서
//	public static void printStar(int a) {
//		for (int j = 0; j < a; j++) {
//			for (int i = 0; i < a; i++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}

//printStar 숫자 질문해서 NxN 구조
//	public static void printStar() {
//	Scanner sc = new Scanner(System.in);
//	System.out.print("값 입력: ");
//	int v = sc.nextInt();
//		for (int i = 0; i < v; i++) {
//		for (int j = 0; j < v; j++) {
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
//}

//printStar 숫자 질문해서 열마다 구조 크기가 점점 커짐
//	public static void printStar() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("값 입력: ");
//		int v = sc.nextInt();
//		for (int i = 1; i <= v; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}

//printStar 숫자형태로 배열하기
//	public static void printStar(int a, int b) {
//		int c=1;
//		for (int j = 0; j < b; j++) {
//		for (int i = 0; i < a; i++) {
//			System.out.print(c++);
//		}
//		System.out.println();
//	}
//}

	public static int sumArray(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum = sum + ary[i];
		}
		return sum;
	}

	private int[] showArray(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		return null;

	}

}
