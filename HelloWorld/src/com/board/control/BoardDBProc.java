package com.board.control;

import java.util.List;
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

	private static final int boardNo = 0;
	private static final int orgNo = 0;

	String loginId = null;// 로그인 성공시 이 아이디로 계속활동을 선언.

	public void execute() {

		loginCheck();

		while (true) {
			int menu = 0;
			System.out.println("1.게시글 작성|2.게시글 리스트|3.원본글 조회|4.수정|5.삭제|6.원본글 & 댓글 삭제|9.종료");

			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("1.게시글 작성");
				writeBoard();
			} else if (menu == 2) {
				System.out.println("2.게시글 리스트");
				getBoardList();
			} else if (menu == 3) {
				System.out.println("3.원본글 조회");
				getBoard();
			} else if (menu == 4) {
				System.out.println("4.수정");
				updateBoard();
			} else if (menu == 5) {
				System.out.println("5.삭제");
				// 삭제 - 본인 글이 아니면 삭제 못함
				deleteBoard();
			} else if (menu == 6) {
				// 삭제 - 원본글과 댓글까지 삭제
				delBoard();
			} else if (menu == 9) {
				System.out.println("9.종료");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

//	로그인
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

			}
		}
	}

//	1.게시글 작성
	public void writeBoard() {

		System.out.println("제목");
		String title = sc.nextLine();
		System.out.println("내용");
		String content = sc.nextLine();

		BoardDB board = new BoardDB();// 보드 생성

		board.setTitle(title);// 보드에 적은 내용들을 게시하기
		board.setContent(content);
		board.setWriter(loginId);
		service.insertBoard(board);// 보드로 보내기
	}

//	2.전체 조회
	public void getBoardList() {
		System.out.println("전체글 조회");
		List<BoardDB> boards = service.getBoardList();
		for (BoardDB board : boards) {
			System.out.println(board);
		}
	}

//	3.글 조회
	public void getBoard() {
		System.out.println("조회할 글 번호");
		int boardNo = sc.nextInt();
		sc.nextLine();
//	원본글
		BoardDB board = service.getBoard(boardNo);
		if (board != null && board.getBoardNo() != 0) {
			System.out.println("-------원본글-------");
			System.out.println("제목: " + board.getTitle());
			System.out.println("내용: " + board.getContent());
			System.out.println("작성자: " + board.getWriter());
			System.out.println("작성일자: " + board.getCreationDate());
//	댓글
			List<BoardDB> list = service.getReply(boardNo);
			if (list.size() > 0) {
				System.out.println("-------댓글-------");
				for (BoardDB brd : list) {
					System.out.println(
							"-> " + brd.getBoardNo() + " | " + brd.getContent() + " | " + brd.getCreationDate());
				}
				System.out.println("-------------------");
			} else {
				System.out.println("댓글이 없습니다.");
			}
			System.out.println("1.댓글작성|2.이전메뉴");
			int subMenu = 0;
			subMenu = sc.nextInt();
			sc.nextLine();
			if (subMenu == 1) {
				System.out.println("댓글 입력: ");
				String reply = sc.nextLine();
				BoardDB board1 = new BoardDB();
				board1.setContent(reply);
				board1.setOrigNo(boardNo);// =(board.getBoardNo())
				board1.setWriter(loginId);
				service.insertReply(board1);

			} else {
				return;
			}
		} else {
			System.out.println("없는 글번호입니다.");
			return;
		}
	}

//4.수정
	public void updateBoard() {
		System.out.println("변경할 글 번호: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목변경: ");
		String title = sc.nextLine();
		System.out.println("내용변경: ");
		String content = sc.nextLine();
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);

		service.updateBoard(board);
	}

//5.삭제
	public void deleteBoard() {// 1건씩 삭제
//		System.out.println("삭제할 글번호: ");
//		int dbNo = sc.nextInt();
//		sc.nextLine();
//		
//		BoardDB board = new BoardDB();
//		board.setBoardNo(boardNo);
//		board.setWriter(loginId);
//
//		service.deleteBoard(board);

		System.out.println("삭제할 글번호: ");
		int dbNo = sc.nextInt();
		sc.nextLine();
		
		BoardDB board = service.getBoard(dbNo);

		if (board == null) {
			System.out.println("게시글이 없습니다.");
		} else if (loginId.equals(board.getWriter())) {
			service.deleteBoard(board);
			System.out.println("게시글이 삭제되었습니다.");
		} else {
			System.out.println("권한이 없습니다.");
		}

	}

//	   6.댓글도 삭제
	public void delBoard() {// 원본글이나 댓글까지 일괄 삭제 ex) 원본글에 댓글이 있을 경우 댓글까지 삭제
		BoardDB board = new BoardDB();
		System.out.println("삭제할 글번호: ");
		int dbNo = sc.nextInt();
		sc.nextLine();
		board.setBoardNo(dbNo);
		board.setOrigNo(board.getBoardNo());
		BoardDB bd = service.getBoard(dbNo);

		if (bd == null) {
			System.out.println("없는 게시글입니다.");
		} else if (loginId.equals(bd.getWriter())) {
			service.delBoard(board);
			System.out.println("게시글이 삭제되었습니다.");
		} else {
			System.out.println("권한이 없습니다.");
		}
	}
}
