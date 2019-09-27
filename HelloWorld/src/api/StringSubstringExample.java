package api;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6);//시작(포함), 끝(불포함)
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);//시작부터 끝까지
		System.out.println(secondNum);
	}
}
