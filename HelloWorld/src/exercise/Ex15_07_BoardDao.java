package exercise;

import java.util.ArrayList;
import java.util.List;

public class Ex15_07_BoardDao {
	public List<Ex15_07_Board> getBoardList() {
		List<Ex15_07_Board> list = new ArrayList<Ex15_07_Board>();
		list.add(new Ex15_07_Board("제목1", "내용1"));
		list.add(new Ex15_07_Board("제목2", "내용2"));
		list.add(new Ex15_07_Board("제목3", "내용3"));
		return list;
	}
}
