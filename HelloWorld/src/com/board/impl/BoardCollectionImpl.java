package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writeBoard(Board board, List<Board> boards) {// 글작성
		boards.add(board);
	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {// 한건조회
		Board boardTemp = null;
		for (Board board : boards) {
			if (board.getBoardNo() == boardNo) {
				boardTemp = board;
			}
		}
		return boardTemp;
	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {// 전체리스트
		List<Board> listTemp = new ArrayList<>();
		for (Board board : boards) {
			listTemp.add(board);
		}
		return listTemp;
	}

	@Override
	public void delBoard(int boardNo, List<Board> boards) {
		for (Board board : boards) {
			if (board.getBoardNo() == boardNo) {
				boards.remove(board);
			}

		}
	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for (Board boardTemp : boards) {
			if (board.getBoardNo() == boardTemp.getBoardNo()) {
				boardTemp.setTitle(boardTemp.getTitle());
				boardTemp.setContents(boardTemp.getContents());
				boardTemp.setWriter(boardTemp.getWriter());
			}
		}
	}
}
