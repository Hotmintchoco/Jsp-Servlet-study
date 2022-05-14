package test3.practice;

import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	String name;
	int grade;
	int ban;
	int no;
	char gender;
	
	int kor;
	int eng;
	int math;
	int total;
	float average;
	
	public static void main(String[] args) {
		Test test = new Test();
		test.kor = 100;
		test.eng = 100;
		test.math = 30;
		
		test.sample4();
	}
	
	public void sample1() {
		total = kor + eng + math;
		average = total/3.0f;
		
		if (average >= 60) {
			if (kor >= 40 && eng >= 40 && math >= 40) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("불합격");
		}
	}
	
	public void sample2() {
		double result;
		
		
		System.out.println("학생이름 : ");
		name = sc.next();
		System.out.println("학년 : ");
		grade = sc.nextInt();
		System.out.println("반 : ");
		ban = sc.nextInt();
		System.out.println("번호 : ");
		no = sc.nextInt();
		System.out.println("성별 : ");
		String genderStr = sc.next();
		gender = genderStr.charAt(0);
		System.out.println("성적 : ");
		double resultDou = sc.nextDouble();
		result = Math.round(resultDou * 100)/100.0;
		
		char genderKor = 0;
		
		if (gender == 'M') {
			genderKor = '남';
		} else if (gender == 'W') {
			genderKor = '여';
		}
		
		System.out.printf("%d학년 %d반 %d번 %c학생 %s은 성적이 "
				, grade, ban, no, genderKor, name);
		System.out.println(result + "이다.");
	}
	
	public void sample3() {
		int var;
		
		System.out.println("정수를 입력하세요.");
		var = sc.nextInt();
		
		if (var >= 0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void sample4() {
		int var;
		String strVar;
		
		System.out.println("정수를 입력해주세요.");
		var = sc.nextInt();
		
		if (var % 2 == 0) {
			strVar = "짝수";
		} else {
			strVar = "홀수";
		}
		
		System.out.println(strVar + "입니다.");
	}

}
