package hello;

import java.util.Scanner;

public class TestScore {

//	필드
	int stuNum;
	String name;
	int kor;
	int eng;
	int math;

//생성자
	public TestScore(int stuNum, String name, int kor, int eng, int math) {
		super();
		this.stuNum = stuNum;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

//	소스 get,set

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int Total() {
		return kor + eng + math;
	}

	public float Avg() {
		return kor + eng + math / 3;
	}

	private static TestScore[] StudentArray = new TestScore[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생성적등록|2.전체리스트|3.학생번호조회|4.전체통계|5.총점기준정렬|6.종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("번호 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				input();
			} else if (menu == 2) {
				list();
			} else if (menu == 3) {
				search();
			} else if (menu == 4) {
				total();
			} else if (menu == 5) {
				array();
			} else if (menu == 6) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

//		1.계정 생성
	public static void input() {
		System.out.println("성적을 등록합니다.");
		System.out.print("번호 입력: ");
		int stuNum = sc.nextInt();
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("국어성적 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어성적 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학성적 입력: ");
		int math = sc.nextInt();
		TestScore accnt = new TestScore(stuNum, name, kor, eng, math);
		for (int i = 0; i < StudentArray.length; i++) {
			if (StudentArray[i] == null) {
				StudentArray[i] = accnt;
				break;
			}
		}
	}

//		2.전체 목록
	public static void list() {
		System.out.println("전체 목록 보기");
		for (TestScore s : StudentArray) {
			if (s != null)
				System.out.println("학생번호: " + s.getStuNum() + "이름: " + s.getName() + ", 국어: " + s.getKor() + ", 영어: "
						+ s.getEng() + ", 수학: " + s.getMath());
		}
	}

//		3.학생번호 조회
	public static void search() {
		System.out.print("학생번호 입력: ");
		int stuNum = sc.nextInt();

		for (TestScore s : StudentArray) {
			if (s != null && stuNum == s.getStuNum())
				System.out.println("학생번호: " + s.getStuNum() + "이름: " + s.getName() + ", 국어: " + s.getKor() + ", 영어: "
						+ s.getEng() + ", 수학: " + s.getMath() + "총점: " + s.Total() + "평균: " + s.Avg());
		}
	}

//	4.전체통계
	public static void total() {
		System.out.println("전체 통계 보기");
		for (TestScore s : StudentArray) {
//			if (s != null)
//				System.out.println("전체 점수: "++"전체 평균: "+);
		}
	}

//	5.총점기준정렬
	public static void array() {

	}
}
