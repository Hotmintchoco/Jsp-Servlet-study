package com.oop.model.dto;

import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
	private int empNO;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

	public Employee() {}
	
	Employee(int no, String name, String dept, String job, int age,
			char gender, int salary, double bonusPoint, String phone, String address) {
		this.empNO = no;
		this.empName = name;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	public Employee empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("사번 입력");
		int empNO = sc.nextInt();
		System.out.println("이름 입력");
		String empName = sc.next();
		System.out.println("소속부서 입력");
		String dept = sc.next();
		System.out.println("직급 입력");
		String job = sc.next();
		System.out.println("나이 입력");
		int age = sc.nextInt();
		System.out.println("성별 입력(여성은 W, 남성은 M)");
		String genderInput = sc.next();
		char gender = genderInput.charAt(0);
		System.out.println("급여 입력");
		int salary = sc.nextInt();
		System.out.println("보너스포인트 입력");
		double bonusPoint = sc.nextDouble();
		System.out.println("전화번호 입력");
		String phone = sc.next();
		System.out.println("주소 입력");
		String address = sc.next();
		
		return new Employee(empNO, empName, dept, job, age, gender, salary,
				bonusPoint, phone, address);
	}
	
	public String empOutput() {
		return "Employee [사번=" + empNO + ", 이름=" + empName + ", 소속부서=" +
				dept + ", 직급=" + job + ", 나이=" + age
				+ ", 성별=" + gender + ", 급여=" + salary +
				", 보너스포인트=" + bonusPoint + ", 전화번호=" + phone
				+ ", 주소=" + address + "]";
	}
	
}

