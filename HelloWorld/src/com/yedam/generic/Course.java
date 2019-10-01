package com.yedam.generic;

public class Course<T> {
	private String name;//과정명
	private T[] students;//학생수용을 배열로 표현
	
	public Course(String name, int capacity) {
		this.name=name;
		students=(T[]) new Object[capacity];//=new T[capacity]와 같음
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0;i<students.length;i++) {//학생을 몇명까지 담겠다
			if(students[i]==null) {
				students[i]=t;
				break;
			}
		}
	}
}
