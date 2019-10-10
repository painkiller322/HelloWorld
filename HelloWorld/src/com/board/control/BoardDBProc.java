package com.board.control;

import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();

	private String name;
	private String id;
	private String pass;

	String loginId = null;// 로그인 성공시 이 아이디로 계속활동을 선언.

	public void execute() {

		loginCheck();

		while (true) {
			int menu = 0;
			System.out.println("1.게시글 작성|2.게시글 리스트|3.한건 조회|4.댓글 조회|5.댓글 추가|6.수정|7.삭제|9.종료");

			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("1.게시글 작성");
				writeBoard();
			} else if (menu == 2) {
				System.out.println("2.게시글 리스트");
				getBoardList();
			} else if (menu == 3) {
				System.out.println("3.한건 조회");
				getBoard();
			} else if (menu == 4) {
				System.out.println("4.댓글 조회");
				getReply();
			} else if (menu == 5) {
				System.out.println("5.댓글 추가");
				insertReply();
			} else if (menu == 6) {
				System.out.println("6.수정");
				updateBoard();
			} else if (menu == 7) {
				System.out.println("7.삭제");
				deleteBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public void loginCheck() {
		while (true) {
			System.out.println("id를 입력하세요.");
			String id = sc.nextLine();
			System.out.println("pw를 입력하세요.");
			String pass = sc.nextLine();
			String name = service.loginCheck(id, pass);
			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id;// 로그인후 계속 활동을 유지할 할 아이디로 지정
				break;
			} else {
				System.out.println("id와 pw를 다시 입력하세요.");
			}
		}
	}

	public void writeBoard() {

		System.out.println("제목");
		String title = sc.nextLine();
		System.out.println("내용");
		String content = sc.nextLine();
		
		BoardDB board=new BoardDB();//보드 생성
		
		board.setTitle(title);//보드에 적은 내용들을 게시하기
		board.setContent(content);
		board.setWriter(loginId);
		service.insertBoard(board);//보드로 보내기
	}

	public void getBoardList() {

	}

	public void getBoard() {

	}

	public void getReply() {

	}

	public void insertReply() {

	}

	public void updateBoard() {

	}

	public void deleteBoard() {

	}

}
