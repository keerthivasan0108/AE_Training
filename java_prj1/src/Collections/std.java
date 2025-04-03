package Collections;
public class std implements Comparable<std>{
	public String name;
	public int id;
	public int age;
	public std(String name,int id,int age){
		this.name = name;
		this.id = id;
		this.age = age;
		
	}
	
	//age sorting
	@Override
	public int compareTo(std s) {
		return s.age - this.age;
//		return this.age - s.age;
	}
}
