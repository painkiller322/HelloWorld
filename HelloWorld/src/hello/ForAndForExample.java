package hello;

public class ForAndForExample {
	public static void main(String[] args) {
		// j가 다섯번 돌 동안 i는 한번 도는 구조. 구구단에 응용
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("j>> " + j);
			}
			System.out.println("i:: " + i);
		}
		// while을 이용한 구구단 만들기
		int a = 2;
		while (a < 10) {
			System.out.println("<<" + a + "단>>");
			int j = 1;
			while (j < 10) {
				System.out.println(a + "*" + j + "=" + (a * j));
				j++;
			}
			a++;
		}
		// do와 while 구문을 이용한 구구단 만들기
		int b = 1;
		do {
			System.out.println(4 + "*" + b + "=" + (4 * b));
			b++;
		} while (b < 10);
	}
	//
}
