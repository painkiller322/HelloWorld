package exercise;

import java.util.function.IntBinaryOperator;

public class Exercise14_05 {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((a,b)->{
			return (a>=b? a:b);
		}
		);
		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin((a,b)->{
			return (a>=b? b:a);
		}
		);
		System.out.println("최소값: " + min);
	}
}
