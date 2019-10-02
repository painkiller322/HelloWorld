package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime, endTime;
		
		System.out.println("ArrayList");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간은: " + (endTime - startTime));
		
		System.out.println("LinkedList");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간은: " + (endTime - startTime));
	}
}
