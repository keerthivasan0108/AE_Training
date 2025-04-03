package pkg1;

import java.util.Arrays;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5,3,8,2,17};
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		Arrays.fill(numbers, 33);
		for(int i:numbers) {
			System.out.print(i+" ");
		}
	}

}
