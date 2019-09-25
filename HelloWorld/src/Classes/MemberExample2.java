package Classes;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] MemberArray = new Member[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.계정생성|2.전체목록|3.ID조회|4.종료");
			System.out.println("-----------------------------");
			System.out.print("번호 입력: ");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				signin();
			} else if (menu == 2) {
				list();
			} else if (menu == 3) {
				login();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

//		1.계정 생성
	public static void signin() {
		System.out.println("계정을 생성합니다.");
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		System.out.print("ID 입력: ");
		String id = sc.nextLine();
		System.out.print("PW 입력: ");
		String password = sc.nextLine();
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		Member accnt = new Member(name, id, password, age);
		for (int i = 0; i < MemberArray.length; i++) {
			if (MemberArray[i] == null) {
				MemberArray[i] = accnt;
				break;
			}
		}
	}

//		2.전체 목록
	public static void list() {
		System.out.println("전체 목록 보기");
		for (Member m : MemberArray) {
			if (m != null)
				System.out.println("이름: " + m.getName() + ", ID: " + m.getId() + ", PW: " + m.getPassword() + ", 나이: "
						+ m.getAge());
		}
	}

//		3.ID 조회
	public static void login() {
		System.out.print("ID 입력: ");
		String id = sc.nextLine();
		System.out.print("PW 입력: ");
		String password = sc.nextLine();
		boolean isId = false, isPw = false;
		String name = null;
		int age = 0;
//id, pw 같으면 이름, 나이를 출력
//id맞고 pw 다르면 비번 틀렸다
//id틀리고 pw틀리면 존재하지 않는 id입니다
		for (Member m : MemberArray) {
			if (m != null && m.getId().equals(id)) {
				if (m.getPassword().equals(password)) {
					isId = true;
					isPw = true;
					name = m.getName();
					age = m.getAge();
					break;
				} else {
					isId = true;
					isPw = false;
					break;
				}
			} else {
				isId = false;
				isPw = false;
			}
		}
		if (isId == true && isPw == true)
			System.out.println("이름은: " + name + ", 나이는" + age);
		else if (isId == true && isPw == false)
			System.out.println("비번 틀림");
		else if (isId == false && isPw == false) {
			System.out.println("존재하지 않는 ID");
		}
	}
}
