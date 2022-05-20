package practice1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {

	static Set<Integer> set = new HashSet<Integer>();
	public static void main(String[] args) {
		lottoDisplay();
	}
	
	public static void lottoDisplay() {
		Random rand = new Random();
		
		for (int i = 0; i < 6; i++) {
			set.add(rand.nextInt(45)+1);
		}
		Integer[] arr = set.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(arr));
	}

}
