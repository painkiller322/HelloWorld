package com.mycompany.bgj;
class Access2{
	public Access2(){
		System.out.println("Access2");
	}
	
}
public class Access1 {
	public int field1; //필드 생성자 메소드
	int field2;
	private int field3;//같은 클래스내에서만

	public void method1() {
		field3 = 10;
		System.out.println("method1");
	}
	void method2() {//동일 패키지
		System.out.println(field3);
		System.out.println("method2");
	}
	private void method3() {//패키지가 같아도 접근안됨. 같은 클래스내에서만 접근가능
		System.out.println("method3");
	}
		
	public Access1(){
		System.out.println("Access1");
	}
}
