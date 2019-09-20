package com.mycompany.bgj;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("hong");
		p1.setAge(20);
		p1.setHeight(-54);
		p1.setWeight(77.7);
		System.out.println("이름은 "+p1.getName());
		System.out.println("나이는 "+p1.getAge());
		System.out.println("키는 "+p1.getHeight());
		System.out.println("체중은 "+p1.getWeight());
			}
}
