package hello;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;// 시작
		int i = 0;
		int j = 0;
//		공 배열
		int[] pitching = new int[3];
		int[] swing = new int[3];
		for (i = 0; i < pitching.length; i++) {
			pitching[i] = (int) (Math.random() * 9 + 1);
			System.out.println(pitching[i]);// 정답
		}

//		입력하기

		System.out.print("1구: ");
		swing[0] = sc.nextInt();
		System.out.print("2구: ");
		swing[1] = sc.nextInt();
		System.out.print("3구: ");
		swing[2] = sc.nextInt();

//		입력값과 공배열의 일치여부
		int strike = 0;
		int ball = 0;

		while (run) {
			for (i = 0; i < pitching.length; i++) {
				for (j = 0; j < swing.length; j++) {
					if (pitching[j] == swing[i] && j == i) {
						strike++;
					}
					 else if (pitching[j] == swing[i] && j != i) {
						ball++;
					}
				}
			}
			System.out.println(strike + "스트라이크, " + ball + "볼");
			if (strike == 3)
				run = false;// 종료
		

//3스트라이크면 종료
			System.out.println("게임종료");
		}
	}
}