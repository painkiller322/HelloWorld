package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardProc {
//	필드
	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10];// db역할
	List<Board> boardAry = new ArrayList<>();
	
//	BoardService service = new BoardServiceImpl();
	BoardCollection service = new BoardCollectionImpl();

//	생성자
	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.변경 5.삭제 6.종료");
			int menu = 0;
			try {// 메뉴에서 숫자 외 다른 문자 입력할때 예외지정
				menu = sc.nextInt();// 에러 발생 가능한 곳
			} catch (Exception e) {// 예외처리
				System.out.println("정상적인 메뉴를 선택하세요.");
				sc.nextLine();
//				e.printStackTrace();
			}
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				delBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	public void writeBoard() {
		System.out.println("글작성.");
		System.out.print("게시글 번호 입력: ");
		int boardNo = sc.nextInt();
		System.out.print("제목을 입력하세요.");
		String title = sc.next();
		System.out.print("내용을 입력하세요.");
		String contents = sc.next();
		System.out.print("작성자 입력하세요.");
		String writer = sc.next();

		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//		}
	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력: ");
		int boardNo = sc.nextInt();
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체글조회.");
		List<Board> resultAry = service.getBoardList(boardAry);
		for (Board brd : resultAry) {
			if (brd != null)
				System.out.println(brd);
		}
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}
	}

	public void updateBoard() {
		System.out.println("변경 번호 입력: ");
		int boardNo = sc.nextInt();
		sc.hasNextLine();
		System.out.println("변경할 제목: ");
		String title = sc.next();
		System.out.println("변경할 내용: ");
		String contents = sc.next();
		System.out.println("변경할 저자: ");
		String writer = sc.next();
		Board board = new Board(boardNo, title, contents, writer);
		service.updateBoard(board, boardAry);
	}

	public void delBoard() {
		System.out.println("삭제 번호 입력: ");
		int boardNo = sc.nextInt();
		service.delBoard(boardNo, boardAry);

	}

}