package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class utility1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,99,11,55,2,18};
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		List<Integer> l = Arrays.asList(5,99,11,55,2,18);
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println(l);
	}

}
