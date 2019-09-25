package com.yedam;

class Calculator {
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}

class Computer extends Calculator {
	@Override // 부모의 메소드를 자식메소드에서 재정의. 부모의 메소드와 타입이 같은지 확인해야 함.
	double areaCircle(double r) {
		return Math.PI * r * r;
	}
	double areaCircle1(double r) {
		return super.areaCircle(r);
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
			System.out.println("결과값: "+com.areaCircle(10));
	}
}
