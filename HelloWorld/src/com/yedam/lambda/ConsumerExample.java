package com.yedam.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
//		컨슈머
		Consumer<String> consumer = (t) -> {
			System.out.println(t + "8");
		};
		consumer.accept("java");

//		바이컨슈머
		BiConsumer<String, String> biConsumer = (t, u) -> {// 매개값 2개, 리턴없다
			System.out.println(t + u);
		};
		biConsumer.accept("java", "8");

//		더블컨슈머(제네릭타입이 아님. 더블로 정해져있다)
		DoubleConsumer doubleConsumer = (d) -> {
			System.out.println("java" + d);
		};
		doubleConsumer.accept(8.0);

//		오브젝트인트 컨슈머
		ObjIntConsumer<String> objConsumer = (s, i) -> {
			System.out.println(s + i);
		};
		objConsumer.accept("java", 8);
	}
}
