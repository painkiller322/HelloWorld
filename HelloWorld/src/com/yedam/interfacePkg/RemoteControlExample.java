package com.yedam.interfacePkg;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("===============");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("===============");
		RemoteControl rc1 = new RemoteControl() {// 익명의 클래스를 리모트로 만들겠다.
			int volume;

			@Override
			public void turnOn() {
				System.out.println("익명구현객체를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("익명구현객체를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
			}
		};
		rc1.turnOn();
		rc1.turnOff();
	}
}
