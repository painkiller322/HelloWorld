package com.yedam.example;

public class Tire {
	int maxRotation;// 사용가능한 최대회전수.
	int accumulatedRotatoin;// 사용으로 인해 축적된 회전수.
	String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		accumulatedRotatoin++;
		if (maxRotation > accumulatedRotatoin) {
			System.out.println(location + "타이어수명: " + (maxRotation - accumulatedRotatoin) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "타이어펑크 ***");
			return false;
		}
	}
}
