package com.yedam.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> memSet = new HashSet<>();

//		Member mem = new Member("1", 1);
//		Member mem1 = new Member("Hello", 1);
//		System.out.println("hashCode" + mem1.hashCode());

//		memSet.add(new Member("홍길동", 30));
//		memSet.add(new Member("홍길", 40));
//		System.out.println("memSet의 객체수: " + memSet.size());
//		for (Member m : memSet) {0
//			System.out.println(m.name + "," + m.age);
//		}

		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World");// 중복되는 값
		System.out.println("객체수: " + set.size());// 객체수 세기
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("반복자 소진 후: ");
		iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.remove("Nice");
		System.out.println("확장 for:");
		for (String str : set) {
			System.out.println(str);
		}

	}
}
