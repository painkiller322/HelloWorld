package com.yedam;

//부모클래스 만들기
public class CellPhone {
//	필드
	String model;
	String color;

//	생성자
	public CellPhone() {
		super();// 모든 클래스는 object의 자식이라서 super입력
	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

//	메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void bell() {
		System.out.println("벨을 울립니다.");
	}

	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
