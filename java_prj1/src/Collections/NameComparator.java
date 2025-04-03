package Collections;

import java.util.Comparator;

public class NameComparator implements Comparator<std>{
	public int compare(std s1,std s2) {
		//return s2.name.compareTo(s1.name); //decending order
		return s1.name.compareTo(s2.name); //acsending order
	}
}
