package Oops;


public class Assignment_3 {

	public static void main(String[] args) {
		
		Student[] std_list = new Student[3];
		std_list[0] = new Student("keerthi",1,90,95);
		std_list[1] = new Student("priya",2,80,95);
		std_list[2] = new Student("satish",3,90,85);

		
		std_list[0].show_details();
		System.out.println();
		std_list[1].show_details();
		System.out.println();
		std_list[2].show_details();
		System.out.println();
		
		std_list[0].avg();
		std_list[1].avg();
		std_list[2].avg();
		

		
		Student x = Student.find_max(std_list);
		
		System.out.println();
		System.out.println("With "+x.avg+" marks "+x.name+" is the highest scorer");
	}
	

	
	
}
