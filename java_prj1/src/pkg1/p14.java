package pkg1;

import java.util.Arrays;

public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5,3,8,2,17};
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		int pos = Arrays.binarySearch(numbers, 8);
		System.out.println("\n8 is found in the postion : "+pos);
		
	}

}
