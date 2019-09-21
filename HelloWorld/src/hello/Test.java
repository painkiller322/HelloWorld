package hello;

public class Test {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++/* 조건에 i--하면 감소치를 계산 */) {
			// 조건문을 넣어 홀수의 합 구할 때 if(i%2==1)혹은 if(i%2!=0), 짝수의 합 구할 때 if(i%2==0)혹은
			// if(i%2!=1)
			sum = sum + i;
		}
		System.out.println("1~10의 합은 " + sum);
//char 와 int 이용해서 알파벳 순서대로 배열

	}
}
