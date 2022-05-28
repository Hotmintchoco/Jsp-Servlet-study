package test.array.premitive;

import java.util.Random;

public class ArraySample {

	public static void main(String[] args) {
		ArraySample sample = new ArraySample();
		sample.test1();
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
}
