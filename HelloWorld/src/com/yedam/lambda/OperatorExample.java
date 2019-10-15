package com.yedam.lambda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator oper) {
		int result = scores[0];// 그냥 0이면 배열값들과 비교하게 됨.
		for (int score : scores) {
			result = oper.applyAsInt(result, score);
		}
		return result;

	}

	public static void main(String[] args) {
//	   최대값 얻기 람다1
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값 람다1: " + max);

//		최대값 얻기 람다2
		int max2 = maxOrMin((a, b) -> {
			return (a >= b ? a : b);
		});
		System.out.println("최대값 람다2: " + max2);

//      최소값 얻기 람다1
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값 람다1: " + min);
		
//		최소값 얻기 람다2
		int min2 = maxOrMin((a, b) -> {
			return (a >= b ? b : a);
		});
		System.out.println("최소값 람다2: " + min2);
	}
}