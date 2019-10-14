package com.board.model;

import java.util.List;

public interface BoardDBService {
//	로그인
	public String loginCheck(String id, String passwd);

//	게시글 작성
	public void insertBoard(BoardDB board);

//	게시글 리스트
	public List<BoardDB> getBoardList();

//	한건 조회
	public BoardDB getBoard(int boardNo);

//	댓글 조회
	public List<BoardDB> getReply(int boardNo);

//	댓글 추가
	public void insertReply(BoardDB board);

//	수정
	public void updateBoard(BoardDB board);// (BoardDB board)라고 쓰면 안의 내용물 다 포함.

//	삭제(글 작성자만 삭제)
	public void deleteBoard(BoardDB board);

//	삭제 글 원본 이랑 댓글도 같이 삭제
	public void delBoard(BoardDB board);

}
