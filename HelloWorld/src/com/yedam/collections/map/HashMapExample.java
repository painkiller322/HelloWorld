package com.yedam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("김길동", 60);
		map.put("홍길동", 50);
		System.out.println("Entry갯수: " + map.size());// 중복되면 뒤에거를 살림
		System.out.println("방법1");// key를 set에 담아서 iterator로 가져옴.
		Set<String> keyset = map.keySet();// key값만 set에 담는다.
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("key: " + key + ", value: " + map.get(key));
		}

//		for (Entry<String, Integer> ent : map) {
//			System.out.println();
//		}
	}
}
