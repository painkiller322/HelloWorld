package hello;

public class ArrayExample4 {
	public static void main(String[] args) {
//알파벳 순서대로
		char chr = 'A';
		int num = chr;
		for (int i = 0; i < 26; i++) {
		System.out.println(chr++ + "," + num++);
		}
		// 배열 복사하는 법 1,2
		String[] strAry = { "Hello", "World", "Good", "Morning" };
		String[] copyAry = new String[strAry.length];
		for (int i = 0; i < strAry.length; i++) {
			copyAry[i] = strAry[i];
		}
		for (String str : strAry) {
			System.out.println(str);
		}
//시스템 어레이카피(뭘 복사할래, 어디부터 할래, 어디에 복사, 어느위치부터, 크기는(얼마나))
		System.arraycopy(strAry, 0, copyAry, 0, strAry.length);
		for (String str : copyAry) {
			System.out.println(str);
		}
	}
}
