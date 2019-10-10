package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();

	@Override
	public String loginCheck(String id, String passwd) {
		String name = dao.getUsername(id, passwd);
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);
	}

	@Override
	public List<BoardDB> getBoardList(BoardDB board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDB getBoard(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertReply(BoardDB board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBoard(BoardDB board) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoard(int boardNo) {
		// TODO Auto-generated method stub

	}

}
