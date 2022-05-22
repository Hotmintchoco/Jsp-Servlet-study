package day10.silsub.model;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Sample sample = new Sample();
//		sample.munjae1();
		sample.munjae2();
	}
	
	public void munjae1() {
		int[][] arr = new int[4][4];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = (int)(Math.random() *100) + 1; 
			}
			arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[3][i] = arr[0][i] + arr[1][i] + arr[2][i];
		}
		
		System.out.print("\t0열 \t 1열 \t 2열 \t 3열\n");
		System.out.printf("0행 \t%d \t%d \t%d \t%d%n",arr[0][0], arr[0][1],
				arr[0][2], arr[0][3]);
		System.out.printf("1행 \t%d \t%d \t%d \t%d%n",arr[1][0], arr[1][1],
				arr[1][2], arr[1][3]);
		System.out.printf("2행 \t%d \t%d \t%d \t%d%n",arr[2][0], arr[2][1],
				arr[2][2], arr[2][3]);
		System.out.printf("3행 \t%d \t%d \t%d \t%d%n",arr[3][0], arr[3][1],
				arr[3][2], arr[3][3]);
	}

	public void munjae2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("생성하고자 하는 열의 개수를 입력하세요.");
		
		int rows = sc.nextInt();
		
		int[][] arr = new int[3][rows];
		int[] sum = new int[3];
		
		System.out.println(rows * 3 + "개의 정수를 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
				sum[i] += arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (sum[i] % 5 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("arr[%d][%d]\t", i, j);
				}
				System.out.println();
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("  = %d\t", arr[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}
		}
	}
}
