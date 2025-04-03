package Collections;

import java.util.ArrayList;

public class Mobile_functions {
	public void find_mobile_by_brand(ArrayList<Mobile> al,String b) {
		System.out.println("List of "+b+" Mobiles");
		for(Mobile a:al) {
			if(a.Brand.equals(b)) {
				a.show_details();
			}
		}
	}
	
	public void display_mobile_by_price_range(ArrayList<Mobile> al,int price_ll,int price_ul) {
		System.out.println("list of Mobile from "+price_ll+" to "+price_ul);
		for(Mobile a:al) {
			if(a.Price >= price_ll && a.Price <= price_ul) {
				a.show_details();
			}
		}
	}
	
	
	public void display_mobile_ram_and_price(ArrayList<Mobile> al,int ram,int price) {
		System.out.println("List of Mobiles which has more ram than "+ram+" GB less price than "+price);
		for(Mobile a:al) {
			if(a.Ram > ram && a.Price < price) {
				a.show_details();
			}
		}
	}
}
