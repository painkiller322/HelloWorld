package api;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		// how1: 전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text, "/");// StringTokenizer 객체 생성
		int countTokens = st.countTokens();// 토큰의 수 세기
		for (int i = 0; i < countTokens; i++) {// 토큰의 개수만큼 토큰을 하나씩 꺼냄
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

		// how2: 남아있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");// StringTokenizer 객체 생성
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}
