package Collections;

public class Student {
	String name;
	int std_id;
	int mark_cc;
	int mark_ml;
	int avg;
	public Student(String name,int std_id,int mark_cc,int mark_ml) {
		this.name = name;
		this.std_id = std_id;
		this.mark_cc = mark_cc;
		this.mark_ml = mark_ml;
	}
	
	public Student(){
		
	}
	
	public int avg() {
		this.avg = (this.mark_cc + this.mark_ml)/2;
		System.out.println("The average marks scored by "+this.name+" is "+this.avg);
		return avg;
	}
	
	public void show_details() {
		System.out.println("Student name : "+this.name);
		System.out.println("Student id : "+this.std_id);
		System.out.println("Mark cc : "+this.mark_cc);
		System.out.println("Mark ml : "+this.mark_ml);
	}
	
	public Student(String name,int std_id) {
		this.name = name;
		this.std_id = std_id;
	}
	
	public Student(int std_id,String name) {
		this.name = name;
		this.std_id = std_id;
	}
	public void display() {
		System.out.println("Student name : "+this.name);
		System.out.println("Student id : "+this.std_id);
	}
	
	
	//find_max
		public static Student find_max(Student std_list[]) {
			Student std_max = new Student();
			std_max.avg = 0;
			
			for(Student s:std_list) {
				if(s.avg>std_max.avg) {
					std_max.avg = s.avg;
					std_max.name = s.name;
				}
			}
			
			return std_max;
			
			
		}
}

