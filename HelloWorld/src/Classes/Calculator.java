package Classes;

public class Calculator {

//	static+메소드
	static double plus(double x, double y) {
		return x + y;
	}
	
	static double minus(double x, double y) {
		return x - y;
	}
	static double pi = 3.14;
	
//	합
	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}

//	평균
	double avg(int a, int b) {
		int sum = plus(a, b);
		double result = sum / 2;
		return result;
	}

//	a와 b의 평균을 실행하여 보여주기
	void execute(int a, int b) {
		double result = avg(a, b);
		println("result: " + result);
	}

//	println을 정의
	void println(String str) {
		System.out.println(str);
	}
}
