package com.board.model;

import java.util.List;

public interface EmployeeService {
	public List<Employee> getEmplist();//전체 리스트 인터페이스 선언
	public Employee getEmployee(int empNo);//한건 조회
	public void insertEmployee(Employee emp);//한건 입력
	public void updateEmployee(Employee emp);//변경처리
	public void deleteEmployee(int empNo);//삭제처리
}
