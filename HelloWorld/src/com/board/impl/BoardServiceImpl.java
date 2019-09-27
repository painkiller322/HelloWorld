package com.board.impl;

import com.board.model.Board;
import com.board.model.BoardService;

public class BoardServiceImpl implements BoardService {

	@Override
	public void writeBoard(Board board, Board[] boards) {// 글작성
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}

	@Override
	public Board getBoard(int boardNo, Board[] boards) {// 한건조회
		Board board = null;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
				board = boards[i];
			}
		}
		return board;
	}

	@Override
	public Board[] getBoardList(Board[] boards) {// 전체리스트
		Board[] boardAry = new Board[boards.length];
		for (int i = 0; i < boards.length; i++) {
			boardAry[i] = boards[i];
		}
		return boardAry;
	}

	@Override
	public void delBoard(int boardNo, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
				boards[i] = null;
			}

		}
	}

	@Override
	public void updateBoard(Board board, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {//글번호 가져오기
				 boards[i].setTitle(board.getTitle());
				 boards[i].setContents(board.getContents());
				 boards[i].setWriter(board.getWriter());//내용 가져와서 바뀐 내용으로 세팅
			}
		}
	}
}
