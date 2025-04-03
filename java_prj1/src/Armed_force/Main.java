package Armed_force;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Armed Forces Application");
		
		System.out.println("Enter your name : ");
		String name  = sc.next();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your location : ");
		sc.nextLine();
		String location = sc.nextLine().toLowerCase();
		System.out.println("Are you Specially abled : Y or N");
		String special  = sc.next();
		
		Armed_forces obj = new Armed_forces(age,location,name,special);
		boolean a = obj.check_age();
		boolean b = obj.check_location();
		boolean c = obj.check_special();
		
		
		if(a && !b && c) {
			System.out.println("You are eligible to apply");
		}
		else { 
			System.out.println("You are not eligible to apply");
		}
		sc.close();
		
	}

}

class Armed_forces { 
	int age;
	String location;
	String name;
	String special;
	ArrayList<String> al_location = new ArrayList<>();
	
	public Armed_forces(int age,String location,String name,String special) {
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
