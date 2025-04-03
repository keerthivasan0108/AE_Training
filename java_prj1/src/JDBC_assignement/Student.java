package JDBC_assignement;

public class Student {
	
	int sid;
	String sname;
	int phy;
	int chem;
	double avg;
	
	public Student(int sid,String sname,int phy,int chem) {
		this.sid = sid;
		this.sname = sname;
		this.phy = phy;
		this.chem = chem;
	}
	public void avg() {
		this.avg = (this.phy+this.chem)/2;
	}
}
