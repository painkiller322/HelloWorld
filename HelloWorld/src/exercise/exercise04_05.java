package exercise;

public class exercise04_05 {
	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int result = 0;
		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				result = 4 * x + 5 * y;
				if (result % 60 == 0)
					System.out.println(x + ", " + y);
			}
		}
	}
}