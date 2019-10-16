package exercise;

import java.util.Scanner;

public class Ex05_09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);// 스캐너 객체 생성

		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// 학생수 입력하여 학생수만큼 배열을 생성
				System.out.println("학생수> ");// 학생수 묻는 글을 띄움
				studentNum = scanner.nextInt();// 학생수 입력캐 하는 칸
				scores = new int[studentNum];// 학생수에 입력값만큼 열을 생성
			} else if (selectNo == 2) {
				// 점수 입력
				for (int i = 0; i < studentNum; i++) {// 첫번째 학생부터 순서대로 등장
					System.out.println("scores[" + i + "]> ");// 점수를 넣으라는 화면을 띄움
					int score = scanner.nextInt();// 해당 배열에 점수를 입력
					scores[i] = score;// 현재 배열에 점수가 입력됨
				}
			} else if (selectNo == 3) {
				// 점수리스트 보이게
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]" + scores[i]);// 순서대로 점수가 보이게
				}
			} else if (selectNo == 4) {
				// 점수 최대, 평균 보이게
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < studentNum; i++) {// 학생수만큼
					sum += scores[i];// 점수를 합한다
					if (scores[i] > max)
						max = scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
