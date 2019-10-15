package com.yedam.lambda;

interface MyLocalInterface {
	public void method();
}

//람다를 쓰면 처음 선언한 값이 파이널을 갖고있어서 바꾸는 작업을 하면 에러가 발생한다.
public class UsingLocalVariable {
	void method(int arg) {// final 변경불가.
		int localVal = 0;// final 변경불가.

		arg = 20;
		localVal = 20;

		MyLocalInterface lif = () -> {
//			arg = 10;
//			localVal = 20;
//			System.out.println(arg);
//			System.out.println(localVal);
			System.out.println();
		};
	}
}
