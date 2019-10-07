package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.impl.EmployeeServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc {
//	필드
	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10];// db역할
	List<Employee> employees = new ArrayList<>();

//	BoardService service = new BoardServiceImpl();
	EmployeeService service = new EmployeeServiceImpl();

//	생성자
	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.변경 5.삭제 6.종료");
			int menu = 0;
			try {// 메뉴에서 숫자 외 다른 문자 입력할때 예외지정
				menu = sc.nextInt();// 에러 발생 가능한 곳
			} catch (Exception e) {// 예외처리
				System.out.println("정상적인 메뉴를 선택하세요.");
				sc.nextLine();
//				e.printStackTrace();
			}
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 5) {
				delBoard();
			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

	public void writeBoard() {
		System.out.println("직원 등록.");
		System.out.print("직원번호 입력: ");
		int empId = sc.nextInt();
		System.out.print("이름을 입력하세요.");
		String firstName = sc.next();
		System.out.print("성을 입력하세요.");
		String lastName = sc.next();
		System.out.print("이메일을 입력하세요.");
		String email = sc.next();
		System.out.print("입사일을 입력하세요.");
		String hireDate = sc.next();
		System.out.print("급여를 입력하세요.");
		int salary = sc.nextInt();
		System.out.print("직무번호를 입력하세요.");
		String jobId = sc.next();

		Employee emp = new Employee();//배열에 저장됨
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate);//예시: 2010-10-05
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);

	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력: ");
		int boardNo = sc.nextInt();
//		Board board = service.getBoard(boardNo, boardAry);
//		System.out.println(board);

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}
	}

	public void getBoardList() {
		System.out.println("전체직원조회.");
		List<Employee> employees = service.getEmplist();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}
	}

	public void updateBoard() {
		System.out.println("변경 번호 입력: ");
		int boardNo = sc.nextInt();
		sc.hasNextLine();
		System.out.println("변경할 제목: ");
		String title = sc.next();
		System.out.println("변경할 내용: ");
		String contents = sc.next();
		System.out.println("변경할 저자: ");
		String writer = sc.next();
		Board board = new Board(boardNo, title, contents, writer);
//		service.updateBoard(board, boardAry);
	}

	public void delBoard() {
		System.out.println("삭제 번호 입력: ");
		int boardNo = sc.nextInt();
//		service.delBoard(boardNo, boardAry);

	}

}