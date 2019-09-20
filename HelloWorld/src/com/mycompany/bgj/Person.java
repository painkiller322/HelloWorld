package com.mycompany.bgj;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;

	public String getName() {// 가져온다
		return name;
	}

	public void setName(String name) {// 받아서 name에 담겠다
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0)
			this.age = 0;
		else
			this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0)
			this.height = 0;
		else
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight < 0)
			this.weight = 0;
		else
		this.weight = weight;
	}
}
