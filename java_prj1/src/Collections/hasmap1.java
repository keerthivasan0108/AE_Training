package Collections;

import java.util.HashMap;

public class hasmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(1,"apple");
		hmap.put(2,"orange");
		hmap.put(3,"banana");
		
		System.out.println(hmap);
		
		System.out.println(hmap.get(3));
	}

}
