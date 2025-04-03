package Collections;

import java.util.Comparator;

public class RollNoComparator implements Comparator<std> {
	@Override
	public int compare(std s1,std s2) {
		//return s2.id - s1.id; //decending order
		return s1.id - s2.id;//acsending order
	}
}
