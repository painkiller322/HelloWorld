package com.yedam.generic;

public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box=new Box<String>();//타입을 정하는걸 타입 파라메타
		box.setObj(new String("Hello"));
		String str=box.getObj();
		
		Box<Integer> intBox=new Box<>();
		intBox.setObj(10);
		int intValue=intBox.getObj();
		
//		Box box = new Box();
//		box.setObj(new String("Hello"));
//		String strValue = (String) box.getObj();
//		System.out.println(strValue);
//		
//		box.setObj(new Integer(10));
//		int intValue = (int) box.getObj();
//		System.out.println(intValue);
//
//		box.setObj(new Double(1.1));//더블타입에 데이타를 담음
//		String newStr = (String) box.getObj();//스트링타입으로 불러내기. 실행할때 에러를 알수있다.(제네릭 사용 이유)
	}
}
