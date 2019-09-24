package Classes;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("배광준", "bgj", "bbb123", 33);

		Member m2 = new Member("관리자", "admin");
		m2.setPassword("admin123");
		m2.setAge(0);

		Member m3 = new Member("사용자", "user1", "user123", 10);

		Member[] memberAry = { m1, m2, m3 };

//		이름 입력하여 정보보기
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 이름 입력: ");
		String name = sc.nextLine();
		for (Member m : memberAry) {
			if (m.getName().equals(name))// 가져온 id와 입력한 id와 같은지
				System.out.println(m.getName() + "," + m.getId() + "," + m.getPassword() + "," + m.getAge());
		}

	}
}
