package com.yedam.example2;

import com.yedam.example.HankookTire;
import com.yedam.example.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 10; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1:
				System.out.println("앞왼쪽 hankook 타이어로 교체.");
				car.tireArray[0] = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 Kumho 타이어로 교체.");
				car.tireArray[1] = new KumhoTire("앞오른쪽", 17);
				break;
			case 3:
				System.out.println("뒤왼쪽 Hnakook 타이어로 교체.");
				car.tireArray[2] = new HankookTire("뒤왼쪽", 16);
				break;
			case 4:
				System.out.println("뒤오른쪽 Kumho 타이어로 교체.");
			
				car.tireArray[3] = new KumhoTire("앞오른쪽", 15);
				break;
			}
			System.out.println("=========================");
		}
	}
}
