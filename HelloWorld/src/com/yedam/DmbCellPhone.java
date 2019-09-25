package com.yedam;

//'extends (클래스명)' 으로 부모지정
public class DmbCellPhone extends CellPhone {
//	필드
	int channel;

//	생성자 매개값없는 생성자가 있어서 super를 쓸 수 있다.
	public DmbCellPhone(int channel) {
		super();
		this.channel = channel;
	}

	public DmbCellPhone() {
		super();
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}

//	메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 방송수신을 시작합니다.");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel+"번으로 변경합니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}
}
