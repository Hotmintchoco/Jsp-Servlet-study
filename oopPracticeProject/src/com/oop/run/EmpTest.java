package com.oop.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	static Employee employee = new Employee();
	static ArrayList<Employee> list = new ArrayList<Employee>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		mainMenu();
	}
	
	public static void mainMenu(){
		Outer:
		while (true) {
			System.out.println("1. 새 사원 정보 입력 ");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원정보 출력");
			System.out.println("9. 끝내기");
			
			int input = sc.nextInt();
			
			switch (input) {
			case 1:
				list.add(employee.empInput());
				break;
			case 2:
				modifyMenu(list.get(0));
				break;
			case 3:
				list.removeAll(list);
				System.out.println("삭제가 완료되었습니다.");
				break;
			case 4:
				System.out.println(list.get(0).empOutput());
				break;
			case 9:
				System.out.println("종료합니다.");
				break Outer;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
	
	public static void modifyMenu(Employee e){
		Outer:
		while (true) {
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("5. 이전 메뉴로 이동 =>");
			
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("변경할 이름을 입력하세요.");
				String newName = sc.next();
				e.setEmpName(newName);
				break;
			case 2:
				System.out.println("변경할 이름을 입력하세요.");
				int newSalary = sc.nextInt();
				e.setSalary(newSalary);
				break;
			case 3:
				System.out.println("변경할 이름을 입력하세요.");
				String newDept = sc.next();
				e.setDept(newDept);
				break;
			case 4:
				System.out.println("변경할 이름을 입력하세요.");
				String newJob = sc.next();
				e.setJob(newJob);
				break;
			case 5:
				System.out.println("이전메뉴로 이동");
				break Outer;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}
