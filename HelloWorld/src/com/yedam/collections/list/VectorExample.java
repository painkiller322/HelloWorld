package com.yedam.collections.list;

import java.util.List;
import java.util.Vector;

import com.board.model.Board;

public class VectorExample {//단일 스레드에서 작업하는 컬렉션
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board(1, "제목1", "네용1", "작성자1"));
		list.add(new Board(2, "제목2", "네용2", "작성자2"));
		list.add(new Board(3, "제목3", "네용3", "작성자3"));
		list.add(new Board(4, "제목4", "네용4", "작성자4"));
		list.add(new Board(5, "제목5", "네용5", "작성자5"));
		for(Board b : list) {
			System.out.println(b);
		}
		System.out.println("--------------------------------");
		list.remove(0);
		for(Board b : list) {
			System.out.println(b);
		}
	}
}
