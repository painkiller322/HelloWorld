package hello;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=5; i++) { //( int초기값, 조건값, 조건충족까지 실행)
			sum=sum+i;
			if(i>5) {
				System.out.println(i);
			}
		}
		System.out.println(sum);
		
			for(int l=1; l<=9; l++) {
				System.out.println(3+"*"+l+"="+(3*l));
			}
			for(int l=1; l<=9; l++) {
				System.out.println(4+"*"+l*2+"="+(4*l));
			}
			for(int l=1; l<=9; l++) {
				int k=l*2;
				System.out.println(5+"*"+k+"="+(5*l));
			}
	}
}
