package com.yedam.exception;

public class ThrowsExample {
	public static void main(String[] args) {
		findClass();
		System.out.println("findClass() 호출 후.");
	}

	public static void findClass() {
		Class clazz = null;
		try {
			clazz = Class.forName("java.lang.String2");// forName 메소드에서 lang.String2를 찾아라 없으면 findClass로 넘겨라
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
//			System.out.println(clazz.getName());
		}
	}
}
