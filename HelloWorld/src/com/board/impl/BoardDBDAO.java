package com.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class BoardDBDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;// 초기값 선언

//	수정
	public void updateBoard(BoardDB board) {
		System.out.println("content: " + board.getContent());
		conn = DAO.getConnect();
		String sql = "update boards set orig_no = orig_no ";
		if (board.getTitle() != null && !board.getTitle().equals("")) {
			sql += ", title = ? ";
		}
		if (board.getContent() != null && !board.getContent().equals("")) {
			sql += ", content = ? ";
		}
		sql += "where board_no = ? and orig_no is null ";
		int n = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			if (board.getTitle() != null && !board.getTitle().equals("")) {
				pstmt.setString(++n, board.getTitle());
			}
			if (board.getClass() != null && !board.getContent().equals("")) {
				pstmt.setString(++n, board.getContent());
			}
			pstmt.setInt(++n, board.getBoardNo());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.prepareStatement(sql);// close?
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//	댓글작성
	public void replyBoard(BoardDB board) {
		conn = DAO.getConnect();// DB와 연동
		String sql = "insert into boards values((select max(board_no)+1 from boards) , ?, ?, ?, sysdate, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			pstmt.setInt(4, board.getOrigNo());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 마지막에
			try {
				conn.close();// 종료(+예외 생성)
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//	댓글 보기
	public List<BoardDB> getReplyList(int boardNo) {
		conn = DAO.getConnect();
		String sql = "select * from boards where orig_no = " + boardNo;
		List<BoardDB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}

//	3.글 가져오기
	public BoardDB getBoard(int boardNo) {
		BoardDB board = null;
		conn = DAO.getConnect();
		String sql = "select * from boards where board_no = ? and orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return board;
	}

//	2.전체보기
	public List<BoardDB> getBoardList() { // 전체 조회
		List<BoardDB> list = new ArrayList<>();
		conn = DAO.getConnect();
		String sql = "select * from boards order by 1 desc";
		BoardDB bd = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				bd = new BoardDB();
				bd.setBoardNo(rs.getInt("board_no"));
				bd.setTitle(rs.getString("title"));
				bd.setContent(rs.getString("content"));
				bd.setWriter(rs.getString("writer"));
				bd.setCreationDate(rs.getString("creation_date"));
				bd.setOrigNo(rs.getInt("orig_no"));
				list.add(bd);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}

//	글입력
	public void insertBoard(BoardDB board) {
		conn = DAO.getConnect();// DB와 연동
		String sql = "insert into boards values((select max(board_no)+1 from boards) ,?,?,?,sysdate,null)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 마지막에
			try {
				conn.close();// 종료(+예외 생성)
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public String getUsername(String id, String pass) {
		conn = DAO.getConnect();// DB와 연동
		String sql = "select * from user_login where id=? and passwd=?";
		String name = null;
		try {
			pstmt = conn.prepareStatement(sql);// sql과 연결후 예외처리(try/catch)
			pstmt.setString(1, id);
			pstmt.setString(2, pass);// id랑 passwd 가져오기

			rs = pstmt.executeQuery();// 쿼리 실행
			if (rs.next()) {
				name = rs.getString("name");// db칼럼이름
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;
	}
}
