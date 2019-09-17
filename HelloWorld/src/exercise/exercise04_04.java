package exercise;

public class exercise04_04 {
	public static void main(String[] args) {
		int numA = 0;
		int numB = 0;
		while (numA + numB != 5) {
			numA = (int) (Math.random() * 6) + 1;
			numB = (int) (Math.random() * 6) + 1;
			System.out.println("[" + numA + "," + numB + "]");
			if (numA + numB == 5) {
				break;
			}
		}
	}
}
