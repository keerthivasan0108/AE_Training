package Excel_assignment;

public class Student {
	int sid;
	String Std_name;
	String Sem;
	
	
	public Student() {}
	public Student(int sid,String Std_name,String Sem) {
		this.sid = sid;
		this.Std_name = Std_name;
		this.Sem = Sem;
		
	}
	
}

class Marks{
	int sid;
	int Maths;
	int Phy;
	double Avg;
	public Marks(int sid,int Maths,int Phy,double Avg) {
		this.sid = sid;
		this.Maths = Maths;
		this.Phy = Phy;
		this.Avg = Avg;
	}
	
	public Marks() {
		
	}
	public double avg(int Maths,int Phy) {
		double Avg = (Maths+Phy)/2;
		System.out.println(Avg);
		return Avg;
		
	}
	
	
	
}
