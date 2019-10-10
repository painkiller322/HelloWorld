package com.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.common.DAO;
import com.board.model.BoardDB;

public class BoardDBDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;// 초기값 선언

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
