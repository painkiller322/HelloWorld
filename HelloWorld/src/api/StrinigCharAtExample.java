package api;

public class StrinigCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";//주민번호 입력
		char sex = ssn.charAt(7);//7째 위치의 값
		switch (sex) {//1,3이면 남자로 표시
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2'://2,4면 여자로 표시
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
