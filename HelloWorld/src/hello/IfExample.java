package hello;

public class IfExample {
	public static void main(String[] args) {
		int a=98;
		if(a>50 && a>100) { //||는 or, &&는 and
			System.out.println("50이상.");
			System.out.println("좋은 점수네요.");
		}else {
			System.out.println("그외의 경우");
		}
		
		if(a>90) {
			if(a>=95) {System.out.println("A+");
			}else {	System.out.println("A");}
		}else if (a>80) {
			System.out.println("B");
		}else if (a>70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		if(a>100) {
			System.out.println("만점입니다.");
		}
	}
}
