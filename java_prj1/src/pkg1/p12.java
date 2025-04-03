package pkg1;

import java.util.Arrays;

public class p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5,3,8,2,17};
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		Arrays.sort(numbers);
		System.out.println();
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		
	}

}
