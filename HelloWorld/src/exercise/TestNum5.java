package exercise;

import java.util.Scanner;

public class TestNum5 {
//	필드
	int number;
	String name;
	String course;

//	생성자
	public TestNum5(int number, String name, String course) {
		super();
		this.number = number;
		this.name = name;
		this.course = course;
	}

//	메소드
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	private static TestNum5[] MemberArray = new TestNum5[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.회원성적등록|2.회원번호조회|3.그룹별 리스트|4.종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("번호 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				input();
			} else if (menu == 2) {
				search();
			} else if (menu == 3) {
				list();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

//		1.계정 생성
	public static void input() {
		System.out.println("회원을 등록합니다.");
		System.out.print("회원번호 입력: ");
		int number = sc.nextInt();
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("등록과정 입력: ");
		String course = sc.next();
		TestNum5 accnt = new TestNum5(number, name, course);
		for (int i = 0; i < MemberArray.length; i++) {
			if (MemberArray[i] == null) {
				MemberArray[i] = accnt;
				break;
			}
		}
	}

//		2.회원번호 조회
	public static void search() {
		System.out.print("회원번호 입력: ");
		int number = sc.nextInt();

		for (TestNum5 n : MemberArray) {
			if (n != null && number == n.getNumber())
				System.out.println("회원번호: " + n.getNumber() + "이름: " + n.getName() + ", 등록과정: " + n.getCourse());
		}
	}

//	3.그룹별 리스트
	public static void list() {
		//오름,내림차순
		}
	}

