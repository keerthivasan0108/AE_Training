package pkg1;

import java.util.Scanner;

public class p10 {
	public static int  balance = 5000;
	static int pin = 2004;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String username = "keerthivasan";
		
		
		System.out.println("ATM");
		
			
		System.out.println("Welcome "+username);
			
			int choice = 0;
			
			do{
				
				menu();
				
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				if(choice==4) {
					break;
				}
				
					switch(choice) {
					case 1:
						b();
						break;
					case 2:
						System.out.println("How much money needed :");
						int w = sc.nextInt();
						wi(w);
						break;
					case 3:
						System.out.println("How much money will be deposited :");
						int d = sc.nextInt();
						de(d);
						break;
					default :
						System.out.println("Invalid choice");
					}
				
				
				
						
			}while(choice!=4);
			
			System.out.println("exit");	
		}
		
		public static void menu() {
			System.out.println();
			System.out.println("Choose an options");
			System.out.println("**********************************");
			System.out.println();
			System.out.println("1. check balance");
			System.out.println("2. Withdraw money");
			System.out.println("3. Deposit money");
			System.out.println("4. Exit");
			System.out.println();
			System.out.println("***********************************");
		}
		
		public static void b() {
			System.out.println("Enter your pin: ");
			@SuppressWarnings("resource")
			Scanner sc  = new Scanner(System.in);
			int pi = sc.nextInt();
			if(pi==pin)
				System.out.println("Your account balance is "+balance);
		}
		
		public static void wi(int w) {
			System.out.println("Enter your pin: ");
			@SuppressWarnings("resource")
			Scanner sc  = new Scanner(System.in);
			int pi = sc.nextInt();
			if(pi==pin) {
				if(balance>=w) {
					balance = balance-w;
					System.out.println(w+" is Withdrawed successfully");
				}
				else {
					System.out.println("Money is insufficient in your account");
				}
			}
		}
		
		public static void de(int d) {
			System.out.println("Enter your pin: ");
			@SuppressWarnings("resource")
			Scanner sc  = new Scanner(System.in);
			int pi = sc.nextInt();
			if(pi==pin) {
				balance= balance+d;
				System.out.println(d+" Money deposited Succesfully");
			}
		}
	}


