package Collections;

import java.util.*;


public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vec = new Vector<String>();
		
		vec.add("java");
		vec.add("database");
		vec.add("Git");
		
		System.out.println(vec);
		vec.remove("database");
		System.out.println("After removing : "+vec);
		
		
	}

}
