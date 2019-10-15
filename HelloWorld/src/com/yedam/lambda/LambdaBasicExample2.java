package com.yedam.lambda;

interface MyInterfaceNoArgs {// 매개값 없고 리턴값 없다
	public void method1();
}

interface MyInterfaceWithArgs {// 매개값 있고 리턴값 없다.
	public void method2(int a);
}

interface MyInterfaceWithReturn {// 매개값, 리턴값 있다
	public int method3(int a, int b);
}

public class LambdaBasicExample2 {
	public static void main(String[] args) {
		MyInterfaceNoArgs fina = () -> /* new MyInterfaceNoArgs() */ {

			/*
			 * @Override public void method1() {
			 */
			System.out.println("no arguments expression.");
			/* } */

		};
		fina.method1();

		MyInterfaceWithArgs fiwa = (num) -> {
			System.out.println("result is " + (num * 3));
		};
		fiwa.method2(5);

		MyInterfaceWithReturn fiwr = (a, b) -> {
			return a + b;
		};
		int result = fiwr.method3(5, 10);
		System.out.println("결과값은: " + result);
	}
}
