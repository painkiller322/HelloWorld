package Classes;

public class Car {
//	필드
	String model;
	String color;
	int price;
	int maxSpeed;

//	메소드
	void drive() {
		System.out.println(model+"의 최고속도는 " + maxSpeed + "km/h");
	}

	void stop() {
		System.out.println("멈춥니다.");
	}

	void accelerate() {

	}
}
