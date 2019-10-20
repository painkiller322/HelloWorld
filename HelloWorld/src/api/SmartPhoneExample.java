package api;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

		String strObj = myPhone.toString();
		System.out.println(strObj);

		System.out.println(myPhone);//myPhone.String()을 자동호출해서 리턴값을 얻은 후 출력.
	}
}
