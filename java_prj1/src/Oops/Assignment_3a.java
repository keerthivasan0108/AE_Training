package Oops;

public class Assignment_3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std_list = new Student[3];
		std_list[0] = new Student("keerthi",1,90,95);
		std_list[1] = new Student("priya",2,80,95);
		std_list[2] = new Student("satish",3,90,85);
		int std[] = new int[3]; 
		
		std_list[0].show_details();
		System.out.println();
		std_list[1].show_details();
		System.out.println();
		std_list[2].show_details();
		System.out.println();
		
		
		
		std[0] = std_list[0].avg();
		std[1] = std_list[1].avg();
		std[2] = std_list[2].avg();
		high_score(std,std_list);
		
		
		
	}
	
	public static void high_score(int std[],Student std_list[]) {
		int max = Integer.MIN_VALUE;
		int id = 0;
		for(int i=0;i<std.length;i++) {
			if(max < std[i]) {
				max = std[i];
				id = i;
			}
		}
		System.out.println();
		System.out.println("With "+max+" marks "+std_list[id].name+" is the highest scorer");
	}

	

}
