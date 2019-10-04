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
//		방법1
		Set<String> keyset = map.keySet();// key값만 스트링타입의 set에 담는다.
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println("key: " + key + ", value: " + map.get(key));
		}
		System.out.println("-------------------------------------");
//		방법2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();// map엔트리의 객체를 set에 담아 리턴
		Iterator<Map.Entry<String, Integer>> mapIter = entrySet.iterator();
		while (mapIter.hasNext()) {
			Map.Entry<String, Integer> ent = mapIter.next();
			System.out.println("key: " + ent.getKey() + ", value: " + ent.getValue());
		}
//		방법3
		for (Map.Entry<String, Integer> mapEnt : entrySet) {
			System.out.println(mapEnt.getKey() + ", " + mapEnt.getValue());
		}
//		for (Entry<String, Integer> ent : map) {
//			System.out.println();
//		}
	}
}
