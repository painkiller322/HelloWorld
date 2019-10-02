package com.yedam.collections.set;

public class Member {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	재정의;hashCode가 같은지 체크한 뒤 euals를 체크
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return /*mem.name.equals(this.name) && */ mem.age == this.age;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return /*this.name.hashCode() + */age;// 두개의 홍길동을 비교하고 안되면 equals로
	}

}
