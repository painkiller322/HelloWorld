package hello;

public class gugudan {
	public static void main(String[] args) {
/*
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
			}System.out.println();
		}
	}
	
	*/
		//while 구구단
	int a = 1;
	while (a < 10) {
		int j = 2;
		while (j < 10) {
			System.out.print(j + "*" + a + "=" + (j * a)+" ");
			j++;
		}System.out.println();
		a++;
	}
	}
}