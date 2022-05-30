package test.array.premitive;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public static void main(String[] args) {
		ArraySample sample = new ArraySample();
		sample.test4();
		
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
}
