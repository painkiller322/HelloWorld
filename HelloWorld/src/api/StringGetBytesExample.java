package api;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";

		byte[] bytes1 = str.getBytes();//기본문자셋
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);

		try {

			byte[] bytes2 = str.getBytes("EUC-KR");//EUC-KR은 한글이 2바이트
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");//UTF-8은 한글이 3바이트
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);

		} catch (UnsupportedEncodingException e) {//잘못된 문자셋을 매개값으로 주면 예외가 발생하므로 예외처리가 필요
			e.printStackTrace();
		}
	}
}
