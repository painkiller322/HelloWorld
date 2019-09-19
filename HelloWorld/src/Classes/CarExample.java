package Classes;

public class CarExample {
	private Object car;

	public static void main(String[] args) {// 메인 메소드에
		Car car1 = new Car();// 인스턴스 만들기: Car클래스의 변수 car에 새로운 인스턴스()를 만든다
		car1.model = "그랜저";
		car1.color = "red";
		car1.price = 1000;
		car1.maxSpeed = 200;
		
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.price);
		System.out.println(car1.maxSpeed);
		car1.drive();//Car클래스의 drive메소드를 가져옴
	
		Car car2 = new Car();
		int[] intAry = new int[5];
		Car[] carAry = new Car[2]; //carAry의 배열선언. Car의 인스턴스만 담을 수 있다.
		String[] StrAry = null;
				
		car2.model = "소나타";
		car2.color = "black";
		car2.price = 1500;
		car2.maxSpeed = 250;
		car2.drive();
		
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.price);
		System.out.println(car2.maxSpeed);
		
		carAry[0] = car1;
		carAry[1] = car2;
		
		for(Car c : carAry) {
			System.out.println(c.model+","+c.color);
		}
	}
}
