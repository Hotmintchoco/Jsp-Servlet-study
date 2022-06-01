package test.array.premitive;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		ArraySample sample = new ArraySample();
		sample.test6();
		
	}
	public void test1() {
		int[] arr = new int[10];
		Random rand = new Random();
		int sum = 0;
		
		for(int i : arr) {
			i = rand.nextInt(100) + 1;
			sum += i;
		}
		System.out.println("값의 합은 : " + sum);
	}
	
	public void test2() {
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[0] + " " + arr[9]);
 	}
	
	public void test3() {
		byte[] arr = new byte[10];
		Random rand = new Random();
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (byte)rand.nextInt(256);
		}
		
		for (int i : arr) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
	}
	
	public void test4(){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자 문자열을 입력하세요 : ");
		
		String intArr = sc.nextLine();
		
		for (int i = 0; i < intArr.length(); i++) {
			String str = intArr.substring(i, i+1);
			sum += Integer.parseInt(str);
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void test5(){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("숫자 문자열을 입력하세요 : ");
		
		String intArr = sc.nextLine();
		
		for (int i = 0; i < intArr.length(); i++) {
			char ch = intArr.charAt(i);
			sum += (int)(ch - 48);
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void test6() {
		String personID = "881225-1234567";
		
		int year = 1900 + Integer.parseInt(personID.substring(0, 2));
		int month = Integer.parseInt(personID.substring(2, 4));
		int day = Integer.parseInt(personID.substring(4, 6));
		int gender = Integer.parseInt(personID.substring(7, 8));
		
		LocalDate date = LocalDate.of(year, month, day);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfWeekNumber = dayOfWeek.getValue();
		String getBirthDay = "";
		String getGender = "";
		
		switch (dayOfWeekNumber) {
		case 1: getBirthDay = "월"; break;
		case 2:	getBirthDay = "화"; break;
		case 3: getBirthDay = "수"; break;
		case 4: getBirthDay = "목"; break;
		case 5: getBirthDay = "금"; break;
		case 6: getBirthDay = "토"; break;
		case 7: getBirthDay = "일"; break;
		}
		switch (gender) {
		case 1: getGender = "남자"; break;
		case 2:	getGender = "여자"; break;
		}
		System.out.println("생일 당시의 요일은 " + getBirthDay + "요일입니다.");
		System.out.println("성별은 " + getGender + "입니다.");
		
		date = LocalDate.now();
		int nowYear = date.getYear();
		
		System.out.println("현재 나이는 " + (nowYear - year) + "세입니다.");
	}
}
