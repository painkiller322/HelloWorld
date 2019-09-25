package com.yedam.example;

public class KumhoTire extends Tire {
	KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	boolean roll() {
		this.accumulatedRotatoin++;
		if (maxRotation > accumulatedRotatoin) {
			System.out.println(location + "KumHo 타이어수명: " + (maxRotation - accumulatedRotatoin) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "Kumho 타이어펑크 ***");
			return false;
		}
	}
}
