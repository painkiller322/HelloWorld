package com.yedam.generic;

public class CompareMethod {
	public static void main(String[] args) {
		Pair<String, Integer> p1 = new Pair<>("apple", 10);// Pair 클래스의 K에 String, V에 Integer타입으로 입력
		Pair<String, Integer> p2 = new Pair<>("apple", 10);
		boolean result1 = Util.compare(p1, p2);// p1과 p2를 비교
		if (result1)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음");

//		("user1","orange"); //첫번재도 스트링 두번째도 스트링. 제네릭타입을 만들어 두개를 비교시키자
//		("user2","orange");		
		Pair<String, String> a1 = new Pair<>("user1", "orange");
		Pair<String, String> a2 = new Pair<>("user2", "orange");
		boolean result2 = Util.compare(a1, a2);
		if (result2)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음");

//		Util.compareValue(); //메소드를 만들어
//		Pair("orange",10); //뒤에 오는 값만 같으면 동일하게 보는 메소드를 만들기
//		Pair("apple",10);
		Pair<String, Integer> b1 = new Pair<>("orange", 10);
		Pair<String, Integer> b2 = new Pair<>("apple", 10);
		boolean result3 = Util.compareValue(b1, b2);
		if (result3)
			System.out.println("두 객체가 논리적으로 동일함.");
		else
			System.out.println("두 객체가 논리적으로 동일하지 않음");

//		Integer intV1 = Util.compare("A", "B");// 를 비교시키자
//		System.out.println(intV1);
	}
}
