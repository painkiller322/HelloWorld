package Classes;

public class Student {
//	특성(필드)
	String name;
	String major;
	int studentNo;

//	생성자:클래스이름과 똑같은 이름으로 적고 소괄호. 아무기능이 없을수도 있고, 매개값을 가지고 해당필드에 값을 생성하기도 한다.
	Student() {

	}

	Student(String name) {
		this.name = name;//this는 변수와의 중복을 피하기 위해적음(객체속 필드를 구별하기 위해)
	}

	Student(String name, String major) {
		this.name = name;
		this.major = major;
	}

//	기능(메소드)
	void study() {
		System.out.println("공부합니다.");
	}

	void goToSchool() {
		System.out.println("학교갑니다.");
	}
}
