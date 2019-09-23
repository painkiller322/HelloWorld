package hello;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("년도를 입력하시오: ");
		int year=sc.nextInt();
		System.out.print("월을 입력하시오: ");
		int month=sc.nextInt();
		getCal(year, month);
	}
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.YEAR) + "년");
//		System.out.println(cal.get(Calendar.MONTH) + "월");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일");
//		System.out.println("===================");
//		cal.set(2019, 0, 1);
//		System.out.println(cal.get(Calendar.YEAR) + "년");
//		System.out.println(cal.get(Calendar.MONTH) + "월");
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK) + "요일");
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일");
//		System.out.println("전체일수: " + cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//	}

	public static void getCal(int year, int month) {
		Calendar cal = Calendar.getInstance();
		int translatedMonth = month - 1;
		cal.set(year, translatedMonth, 8);
		String[] week = { "Sun", "Mun", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int monthDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int sDay = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("          <<" + year + "년" + month + "월>>          ");
		for (int i = 0; i < week.length; i++) {
			System.out.print(" " + week[i]);
		}
		System.out.println();
		for (int i = 1; i < sDay; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= monthDay; i++) {
			System.out.printf("%4d", i);
			if ((sDay + i - 1) % 7 == 0)
				System.out.println();
		}
		
		
	}
}
