package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobile_main {
	public static void main(String args[]) {
		ArrayList<Mobile> al_mobiles = new ArrayList<Mobile>();
		
		al_mobiles.add(new Mobile("samsung","12 mini",10000,6));
		al_mobiles.add(new Mobile("redmi","12c",12000,4));
		al_mobiles.add(new Mobile("oppo","12",14000,5));
		al_mobiles.add(new Mobile("samsung","11c",15000,4));
		al_mobiles.add(new Mobile("realme","10",9000,8));
		al_mobiles.add(new Mobile("poco","6",20000,8));
		al_mobiles.add(new Mobile("apple","13",50000,8));
		al_mobiles.add(new Mobile("vivo","13 pro",16000,6));
		al_mobiles.add(new Mobile("poco","12a",9000,8));
		al_mobiles.add(new Mobile("samsung","12 pro",18000,12));
		
		Mobile_functions m = new Mobile_functions();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mobile brand : ");
		String b = sc.nextLine();
		m.find_mobile_by_brand(al_mobiles,b);
		
		System.out.println("Give lower and Upper limit of prices");
		int ll = sc.nextInt();
		int ul = sc.nextInt();
		m.display_mobile_by_price_range(al_mobiles,ll,ul);
		
		System.out.println("More Ram than : ");
		int ram = sc.nextInt();
		System.out.println("Less price than : ");
		int price = sc.nextInt();
		m.display_mobile_ram_and_price(al_mobiles,ram,price);
		sc.close();
		
	}
	
	
	
}
