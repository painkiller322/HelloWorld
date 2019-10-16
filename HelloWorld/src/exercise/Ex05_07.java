package exercise;

public class Ex05_07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		// 작성
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				System.out.println(max = array[i]);
			} else {
				System.out.println(max = max);
			}
		}

		System.out.println("max: " + max);
	}
}
