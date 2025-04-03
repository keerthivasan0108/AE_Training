package Collections;


import java.util.*;
import java.util.Map.Entry;

public class hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,hmstudent> hm = new HashMap<>();
//		Student std1 = new Student("keerthi",101);
//		Student std2 = new Student("priya",102);
		hmstudent std_arr[] = new hmstudent[3];
		std_arr[0] = new hmstudent(101,"keerthi");
		std_arr[1] = new hmstudent(102,"priya");
		std_arr[2] = new hmstudent(103,"ganesh");
		
		for(int i=0;i<std_arr.length;i++) {
			hm.put(std_arr[i].id, std_arr[i]);
		}
		
		for(Entry<Integer,hmstudent> e : hm.entrySet()) {
			System.out.println("Student ID :"+e.getKey()+"\nStudent name : "+e.getValue().name);
		}
	}

}
