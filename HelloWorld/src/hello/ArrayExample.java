package hello;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = { 10, 20, 30, 40, 50, 60 };
		String[] strAry = { "Nice", "Good", "Hello" };
		System.out.println(intAry[0]);
		System.out.println(strAry[0]);
		for (int i = 0; i < 6; i++) {
			System.out.println(intAry[i]);
		}
		System.out.println("strAry의 크기: " + strAry.length);
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		/////////
		int[] aAry = new int[10];
		aAry = new int[20];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] = i * 10 + 10;
		}
		for (int i = 0; i < aAry.length; i++)
			System.out.println(aAry[i]);
		int sum = 0;
		for (int i = 0; i < aAry.length; i++) {
			sum += aAry[i];
		}
		System.out.println("aAry 배열의 합: " + sum);
		//////////
		aAry[0] = 10;
		aAry[1] = 20;
		aAry[2] = 30;
		aAry[3] = 40;
		aAry[4] = 50;
	}
}
