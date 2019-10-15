package com.yedam.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int engScore;
	int matScore;

	public Student(String name, int engScore, int matScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.matScore = matScore;
	}

	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMatScore() {
		return matScore;
	}

}

public class FunctionExample {
	static List<Student> list = Arrays.asList(new Student("hong", 80, 92), new Student("kang", 85, 93));

	public static void printString(Function<Student, String> func) {
		for (Student student : list) {// list에 저장된 항목 수만큼 루핑
			System.out.println(func.apply(student));
		}
	}

	public static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	public static double avg(ToIntFunction<Student> func) {
		int sum = 0, cnt = 0;
		for (Student student : list) {
			cnt++;
			sum += func.applyAsInt(student);
		}
		return (double) sum / cnt;
	}

	public static void main(String[] args) {
//	기존방식
//		Function<Student, String> func = new Function<Student, String>() {
//			@Override
//			public String apply(Student t) {
//				return t.getName();
//			}
//		};
//		printString(func);

//		이름 람다방식
		printString((t) -> {
			return t.getName() + "입니다.";
		});
		
//		영어점수 기존방식
		ToIntFunction<Student> func = new ToIntFunction<Student>() {
			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}
		};
		System.out.println("영어점수");
		printInt(func);

//		수학점수 람다식
		System.out.println("수학점수");
		printInt((s) -> {
			return s.getMatScore();
		});

//		영어평균 기존방식
		System.out.println("영어평균");
		ToIntFunction<Student> func2 = new ToIntFunction<Student>() {

			@Override
			public int applyAsInt(Student value) {
				return value.getEngScore();
			}

		};
		double result = avg(func2);
		System.out.println("result: " + result);

//		수학평균 람다식
		System.out.println("수학평균");
		result = avg((t) -> {
			return t.getMatScore();
		});
		System.out.println("result: " + result);
	}

//
}
