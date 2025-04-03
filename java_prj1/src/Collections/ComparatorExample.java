package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<std> std_list = new ArrayList<std>();
		std_list.add(new std("Priya",113,26));
		std_list.add(new std("bob",111,46));
		std_list.add(new std("keerthi",112,36));
		std_list.add(new std("logesh",110,18));
		
		for(std s:std_list) {
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
		System.out.println();
		System.out.println("Sorted list : ");
		
		//Collections.sort(std_list,new RollNoComparator());
		Collections.sort(std_list,new NameComparator());
		
		for(std s:std_list) {
			System.out.println(s.id+" "+s.name+" "+s.age);
		}
	}

}
