package Armed_force;

import java.util.ArrayList;
import java.util.Scanner;

public class Armed_force {
	int age;
	String location;
	String name;
	String special;
	ArrayList<String> al_location = new ArrayList<>();
	
	public Armed_force(int age,String location,String name,String special) {
		this.age = age;
		this.location = location;
		this.name = name;
		this.special = special;
	}
	
	Scanner sc = new Scanner(System.in);
	boolean a = false;
	public boolean check_age() {
		if(this.age>=16 && this.age<=35) {
			a= true;
		}
		else {
			a = false;
		}
		return a;
		
	}
	
	public boolean check_location() {
		
		//al_location.add("andaman");
		al_location.add("chandigarh");
		//al_location.add("dadra");
		//al_location.add("daman and diu");
		al_location.add("delhi");
		al_location.add("goa");
		al_location.add("mumbai");
		al_location.add("kolkatta");
		al_location.add("goa");
		al_location.add("jammu and kashmir");
		al_location.add("ladakh");
		//al_location.add("pondicherry");
		
//		System.out.println(this.location);
		return al_location.contains(this.location);
		
	}
	boolean s = true;
	public boolean check_special() {
		if(this.special.equals("Y")) {
			
			return false;
		}
		return s;
	}
	
	
}
