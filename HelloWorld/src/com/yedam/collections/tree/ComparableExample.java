package com.yedam.collections.tree;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {// 나이를 크다작다로 비교하여 오름차순정렬이 됨.
		if (this.age > o.age)
			return 1;
		else if (this.age == o.age)
			return 0;
		else
			return -1;
	}
}

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		tSet.add(new Person("aaa", 30));
		tSet.add(new Person("bbb", 25));
		tSet.add(new Person("cc", 35));
		tSet.add(new Person("ddddd", 50));

		Iterator<Person> iter = tSet.iterator();
		while (iter.hasNext()) {// hasNext:가져올 요소가 있는지 없는지 확인. 소진후에도 체크
			
			Person p = iter.next();
			System.out.println(p.name + ", " + p.age);
			
//			System.out.println(iter.next().name + ", " + iter.next().age);//next()가 가져와서 소진시켜서 안됨.
		}
	}

}
