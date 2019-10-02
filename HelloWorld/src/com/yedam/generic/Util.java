package com.yedam.generic;

public class Util {
	public static <T> Box<T> boxing(T t) {// <제네릭타입>에 든거에 따라 메소드때 정해지는 값으로 리턴하겠다.
		Box<T> box = new Box<T>();
		box.setObj(t);
		return box;

	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;
	}

	public static <K, V> boolean compareValue(Pair<K, V> b1, Pair<K, V> b2) {
		boolean bb = b1.getValue().equals(b2.getValue());
		return bb;
	}

	public static <T extends Number> int compare(T t1, T t2) {// T는 Number를 상속한다
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
	}

	public static <K, V> V getValue(Pair<K, V> p, K s) {
		if (p.getKey().equals(s)) {
			return p.getValue();
		} else {
			return null;
		}
	}
}
