package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Product_assignment extends Product_functions{
	static HashMap<Integer,Product> hm = new HashMap<Integer,Product>();
	static HashMap<Integer,Product> pp = new HashMap<Integer,Product>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product pro_arr[] = new Product[10];
		pro_arr[0] = new Product(101,"mobile",10000,"redmi",15);
		pro_arr[1] = new Product(102,"laptop",12000,"lenovo",25);
		pro_arr[2] = new Product(103,"TV",20000,"samsung",35);
		pro_arr[3] = new Product(104,"fan",14000,"V&co",45);
		pro_arr[4] = new Product(105,"Ac",16000,"sathiya",5);
		pro_arr[5] = new Product(106,"bike",50000,"Royal",13);
		pro_arr[6] = new Product(107,"mobile",10000,"java",11);
		pro_arr[7] = new Product(108,"watch",20000,"rolex",10);
		pro_arr[8] = new Product(109,"mobile",50000,"Apple",30);
		pro_arr[9] = new Product(110,"computer",40000,"HP",32);
		
		for(int i=0;i<pro_arr.length;i++) {
			hm.put(pro_arr[i].Product_ID, pro_arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		int pur;
		int choice;
		System.out.println("Welcome to shop");
		do {
			System.out.println("");
			System.out.println("Options :");
			System.out.println("");
			System.out.println("1) Product details  :");
			System.out.println("2) Bill to the Purchaser ");
			System.out.println("3) Discounts & Offers :");
			System.out.println("4) Exit :");
			System.out.println("");
			System.out.println("Enter Your choice : ");
			choice = sc.nextInt();
			switch(choice){
			case 1:
							
				product_details(pro_arr);
				System.out.println("Purchasing product Id : ");
				pur = sc.nextInt();
				if(pur==111)
					break;
				
				System.out.println("how much quantity you need : ");
				int qty = sc.nextInt();
				if(qty<=hm.get(pur).Quantity) {
					hm.get(pur).Quantity = hm.get(pur).Quantity-qty;
					System.out.println(+qty+" "+hm.get(pur).Product_Name+" have purchased successfully");
					int pv = qty*hm.get(pur).Price;
					System.out.println("Purchased for "+pv);
					pp.put(hm.get(pur).Product_ID, hm.get(pur));
					pp.get(pur).purchased_qty = qty;
					pp.get(pur).total = pv;
				}
				else {
					System.out.println("Purchase failed due to insufficient stock");
				}
				break;
			case 2:
				bill(pp);
				break;
			case 3:
				discounts();
			}	
			
		}while(choice!=4);
		
		exit();
//		if(pur == 111) {
//			exit();
//		}
		//bill
		sc.close();
		
		//Discounts and Offers
		
		
	}
	
	

}
