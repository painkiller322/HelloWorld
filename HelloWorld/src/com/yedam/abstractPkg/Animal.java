package com.yedam.abstractPkg;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();// 추상 메소드는 정의명령어(system.out)가 못온다.
}

class Cat extends Animal {

	@Override
	public void sound() {// 변수를 만들면 사운드를 재정의라하고 하면 새로운 클래스마다 정의되어야 한다.
		System.out.println("야옹.");
	}
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍.");
	}

}
