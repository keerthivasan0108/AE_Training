package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Product_functions{
	static double total_money;
	static int mobile_purchased;
	static double mobile_price;
	public static void product_details(Product pro_arr[]) {
		System.out.println("");
		System.out.println("1) Product details : ");
		System.out.println("");
		System.out.println("*******************************************************************");
		System.out.println("| P-ID |  Product Name\t|  Qty  |\tPrice\t|\tBrand\t  |");
		System.out.println("*******************************************************************");
		
		
		for(int i=0;i<pro_arr.length;i++) {
			pro_arr[i].show_details();
		}
		
		System.out.println("| 111  |  exit");
		System.out.println("*******************************************************************");
	}
	
	public static void exit() {
		System.out.println("Thank you... ");
	}
	
	public static void purchase(HashMap<Integer,Product> pp) {
		for(Entry<Integer,Product> e:pp.entrySet()) {
			e.getValue().purchased();
			total_money = total_money+e.getValue().total;
		}
	}
	
	public static void bill(HashMap<Integer,Product> pp) {
		System.out.println("");
		System.out.println("2) Bill to the Purchaser ");
		System.out.println("******************************************************************");
		System.out.println("|P-ID  | Product Name\t| Unit Price\t|\tQty\t  |\ttotal\t  |");
		purchase(pp);
		System.out.println("\t\t\t\t\t\t\t        "+total_money);
		try {
		if(pp.get(101).purchased_qty>=3){
			mobile_purchased = pp.get(101).purchased_qty;
			mobile_price = pp.get(101).total - pp.get(101).total*0.1;
		}}
		catch(Exception e) {
			System.out.println("Continue");
		}
		System.out.println("******************************************************************");
	}
	
	public static void discounts() {
		System.out.println("");
		System.out.println("3) Discounts & Offers :");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("a) if the bill is more than Rs.25000/-, 20% discount on the total bill");
		System.out.println("b) if the bill is between 15000/- and 25000/- 10% discount on the tootal bill");
		System.out.println("c) if 3 mobiles are purchased, 10% discount");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Your total Bill is "+total_money);
		if(total_money > 25000) {
			System.out.println("Discount of 20% from the total bill : "+total_money*0.2);
			total_money = total_money - (total_money*0.2);
		}
		else if(total_money >=15000 && total_money<25000) {
			System.out.println("Discount of 10% from the total bill for money between 15000 to 25000 : "+total_money*0.1);
			total_money = total_money - total_money*0.1;
		}
		
		
		if(mobile_purchased >= 3) {
			System.out.println("After Discount of 10% for mobile cost is : "+mobile_price);
			
		}
		
		System.out.println("Your final bill including all discounts "+total_money);
		System.out.println("Thank you for purchasing come again!");
	}
}
