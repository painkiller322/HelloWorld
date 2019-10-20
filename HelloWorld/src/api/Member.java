package api;

import java.util.Arrays;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	// 참조 타입 필드 (깊은 복제 대상)
	public int[] scores;
	public Car car;

//	얕은 복제 생성자
//	public Member(String id, String name, String password, int age, boolean adult) {
//		this.id = id;
//		this.name = name;
//		this.password = password;
//		this.age = age;
//		this.adult = adult;

//		깊은 복제 생성자
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

//깊은 복제. clone()메소드 재정의
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone();
		// scores를 깊은복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

//	얕은 복제
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();// 재정의된 clone()메소드 호출
		} catch (CloneNotSupportedException e) {

		}
		return cloned;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
