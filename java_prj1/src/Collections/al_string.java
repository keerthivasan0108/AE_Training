package Collections;

import java.util.ArrayList;

public class al_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("orange");
		al.add("graphs");
		al.add("pinapple");
		
		System.out.println(al.get(2));
		for(String a:al) {
			System.out.print(a+" ");
		}
		al.add(3,"mango");
		System.out.println();
		for(String a:al) {
			System.out.print(a+" ");
		}
		
		//remove
		al.remove(3);
		System.out.println();
		for(String a:al) {
			System.out.print(a+" ");
		}
		
		
	}

}
