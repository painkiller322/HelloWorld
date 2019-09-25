package com.yedam.example;

public class HankookTire extends Tire {
	HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	boolean roll() {
		this.accumulatedRotatoin++;
		if (maxRotation > accumulatedRotatoin) {
			System.out.println(location + "Hankook 타이어수명: " + (maxRotation - accumulatedRotatoin) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "Hankook 타이어펑크 ***");
			return false;
		}
	}
	
}
