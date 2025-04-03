package Collections;

import java.util.ArrayList;

public class al_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> slist = new ArrayList<Student>();
		Student s1 = new Student("keerthi",101);
		Student s2 = new Student("satish",102);
		Student s3 = new Student("priya",103);
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		
		Student s4 = slist.get(2);
		s4.display();
		
		
		for(Student s:slist) {
			if(s.std_id==101) {
				System.out.println("");
				System.out.println("Student name : "+s.name);
			}
		}
	}

}
