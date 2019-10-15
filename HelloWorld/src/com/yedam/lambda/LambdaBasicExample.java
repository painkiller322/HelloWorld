package com.yedam.lambda;

@FunctionalInterface
interface MyInterface {
	int print(int a, int b);
}

class MyInterfaceClass implements MyInterface {

	@Override
	public int print(int a, int b) {
		return a + b;
	}

}

public class LambdaBasicExample {
	public static void main(String[] args) {
		MyInterface mi = new MyInterfaceClass();
		int result = mi.print(4, 9);
		System.out.println("합 결과값: " + result);

		mi = /*
				 * new MyInterface() {
				 * 
				 * @Override public int print
				 */(/* int */ a, /* int */ b) -> {
			return a * b;
			/* } */
		};
		result = mi.print(3, 5);
		System.out.println("곱 결과값: " + result);

		// mi.print(8,4) -> "결과값은: 2"로 나오게
		mi = (c, d) -> {
			return c / d;
		};
		result = mi.print(8, 4);
		System.out.println("나누기 결과값: " + result);
	}
}
