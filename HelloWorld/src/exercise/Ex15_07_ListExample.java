package exercise;

import java.util.List;

import com.board.model.Board;

public class Ex15_07_ListExample {
	public static void main(String[] args) {
		Ex15_07_BoardDao dao = new Ex15_07_BoardDao();
		List<Ex15_07_Board> list = dao.getBoardList();
		for (Ex15_07_Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
