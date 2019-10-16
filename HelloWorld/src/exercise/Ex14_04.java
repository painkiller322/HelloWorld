package exercise;

import java.util.function.IntSupplier;

public class Ex14_04 {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
//			x *= 10; 컴파일에러 원인
			int result = x + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}
}