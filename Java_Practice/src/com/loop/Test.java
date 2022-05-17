package com.loop;

import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Test test = new Test();
		test.countInputCharacter();
	}
	public void countInputCharacter(){
		System.out.print("문자열 입력 : ");
		String inputStr = sc.next();
		
		for (int i = 0; i < inputStr.length(); i++) {
			char strChar = inputStr.charAt(i);
			
			if (!(65<= strChar && strChar <=90 || 97<= strChar && strChar <=122)) {
				System.out.println("영문자가 아닙니다.");
				return;
			}
		}
		
		System.out.print("문자 입력 : ");
		String inputChar = sc.next();
		int count = 0;
		
		char toChar = inputChar.charAt(0);
		
		for (int i = 0; i < inputStr.length(); i++) {
			char strChar = inputStr.charAt(i);
			
			if(strChar == toChar)
				count++;
		}
		
		System.out.println("포함된 갯수 : " + count + "개");
			
	}

}
