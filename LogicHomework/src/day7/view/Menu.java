package day7.view;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.printStar2();
	}
	public void printStar1(){
		System.out.println("정수 하나 입력하세요.");
		int input = sc.nextInt();
		
		if (input >= 0) {
			for (int i = 0; i < input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i+1);
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void printStar2(){
		System.out.println("정수 하나 입력하세요.");
		int input = sc.nextInt();
		
		if (input > 0) {
			for (int i = 0; i < input; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if(input == 0) {
			System.out.println("출력 기능이 없습니다.");
		} else {
			input = input * -1;
			for (int i = input; i > 0; i--) {
				for (int j = 0; j < input - i; j++) {
					System.out.print(" ");
				}
				
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
