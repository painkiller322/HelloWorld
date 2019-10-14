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
	public List<BoardDB> getBoardList() {
		List<BoardDB> list = dao.getBoardList();
		return list;
	}

	@Override
	public BoardDB getBoard(int boardNo) {
		return dao.getBoard(boardNo);
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		return dao.getReplyList(boardNo);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.replyBoard(board);
	}

	@Override
	public void updateBoard(BoardDB board) {
		// 해당 글에 대한 권한이 있는지 확인
		if (dao.checkResponsibility(board)) {// 참이면 변경
			dao.updateBoard(board);
			System.out.println("변경되었습니다.");
		} else {// 권한이 없으면 변경 안됨.
			System.out.println("해당글에 대한 권한이 없습니다.");
		}
		dao.updateBoard(board);
	}

	@Override
	public void deleteBoard(BoardDB board) {
		if (dao.checkResponsibility(board)) {// 권한체크
			dao.deleteBoard1(board);
//			if (!dao.checkForReply(board.getBoardNo())) {// 댓글유무체크
//				dao.deleteBoard2(board);
//				System.out.println("삭제되었습니다.");
//			} else {
//				System.out.println("댓글이 있어서 삭제가 되지 않습니다.");
//			}
//		} else {
			System.out.println("권한이 없습니다.");
		}
	}

	@Override
	public void delBoard(BoardDB board) {
		dao.delBoard(board);
	}

}
