package com.yedam.collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;

	Fruits(String name, int price) {
		this.name = name;
		this.price = price;
	}

}

class ComparatorClass implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		if (o1.price > o2.price)
			return -1;
		else if (o1.price == o2.price)
			return 0;
		else
			return 1;
	}

}

public class ComparatorExample {

	public static void main(String[] args) {
		TreeSet<Fruits> tSet = new TreeSet<>(new ComparatorClass());
		tSet.add(new Fruits("aaa", 30));
		tSet.add(new Fruits("bbb", 25));
		tSet.add(new Fruits("cc", 35));
		tSet.add(new Fruits("ddddd", 50));

		Iterator<Fruits> iter = tSet.iterator();
		while (iter.hasNext()) {// hasNext:가져올 요소가 있는지 없는지 확인. 소진후에도 체크
			Fruits f = iter.next();
			System.out.println(f.name + ", " + f.price);
		}
	}
}
