package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// List 인터페이스를 구현하는 ArrayList 클래스.
		List<String> list = new ArrayList<>();// = new String[10];
		list.add("Hello");
		list.add("World");
		list.add("Nice");
		list.add("Java");
		list.add(2, "Insert");// 3열에 내용을 "Insert"이라고 담음. 그러면 그 이후 열은 한칸씩 밀려난다.
		int size = list.size();// 몇건의 리스트가 담겨있는지 볼 수 있는 메소드
		System.out.println("개체수는: " + size);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index[" + i + "]>> " + list.get(i));
		}
		String returnVal = list.remove(2);// 3열의 내용을 지움
		System.out.println("return: " + returnVal);
		for (String str : list) {
			System.out.println(str);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index[" + i + "]>> " + list.get(i));// 지워지면 이후 열은 한칸씩 당겨진다.
		}
	}
}
