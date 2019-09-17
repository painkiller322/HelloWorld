package exercise;

public class exercise04_03 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<=100; i++) {
			if(i%3==0) sum +=i;
		}System.out.println("3의 배수의 합: "+sum);
	}
}
