package hello;

public class WhileExample {
	public static void main(String[] args) {
		//4단 출력
		int i=1;
		while(true) {
			System.out.println(i);
			if(i++<5) continue; //컨티뉴의 다음 구문을 무시하고 건너뛰고 계속 순환. 조건을 충족시 컨티뉴 소멸하고 다음구문 진행?
			System.out.println(4+"*"+i+"="+(4*i));
			if(i==9) break; //i가 5가 되면 그만하고 빠져나와라 (while조건에 그만둘수 없는 무한루프를 피하기 위해)
			//i++;
		}
}
}
