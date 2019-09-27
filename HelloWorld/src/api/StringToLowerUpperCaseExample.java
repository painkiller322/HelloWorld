package api;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";//자바 대소문자가 다름

		System.out.println(str1.equals(str2));

		String lowerStr1 = str1.toLowerCase();//소문자화
		String lowerStr2 = str2.toLowerCase();//소문자화
		System.out.println(lowerStr1.equals(lowerStr2));//소문자화 되어서 비교하면 같음

		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 구분을 무시하는 명령이라서 같음
	}
}
