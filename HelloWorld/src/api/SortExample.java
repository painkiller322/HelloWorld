package api;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };
		Arrays.sort(scores);//오름차순 배열
		;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();

		String[] names = { "홍길동", "박동수", "김민수" };
		Arrays.sort(names);//오름차순 정렬
		for (int i = 0; i < names.length; i++) {
			System.out.println("names{" + i + "]=" + names[i]);
		}
		System.out.println();

		Member2 m1 = new Member2("홍길동");
		Member2 m2 = new Member2("박동수");
		Member2 m3 = new Member2("김민수");
		Member2[] members = { m1, m2, m3 };
		Arrays.sort(members);//내용을 오름차순으로 정렬
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name" + members[i].name);
		}
	}
}
