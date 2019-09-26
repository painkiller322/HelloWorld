package com.yedam.interfacePkg;

public class Television implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
