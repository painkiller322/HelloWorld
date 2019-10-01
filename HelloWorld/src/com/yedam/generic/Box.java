package com.yedam.generic;

public class Box<T> {//클래스타입에 제네릭 선언. <>안에 알파벳은 아무거나, 통일시켜야
	private  T obj;//오브젝트는 모든 타입의 최상위라서 어떤 타입이든 받고 쓸수 있다.

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}
