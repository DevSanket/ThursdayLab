//Q3: Create a menu for food counter and accept the items from user and display the final Bill amount with the item is ordered

package Sankets;

import java.util.Scanner;

public class Menu_Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		
		//default values 
		int amount = 0;
		char ans = 'y';
		
		
		do {
			//Menu
			System.out.println("Welcome");
			System.out.println("1. Veg Thali  200rs");
			System.out.println("2. non-Veg Thali  300rs");
			System.out.println("3. Chicken  250rs");
			System.out.println("4. Palak Paneer  300rs");
			System.out.println("5. Roti(1)  20rs");
			
			int option = sc.nextInt(); //pick option
			switch(option) {
			case 1:
				//just adding values in global variable
				amount += 200;
				System.out.println(" Veg Thali added ");
				System.out.println(" You Want something Else y/n");
				ans = sc.next().charAt(0);
				break;
			case 2:
				amount += 300;
				System.out.println(" non-Veg Thali added ");
				System.out.println(" You Want something Else y/n");
				ans = sc.next().charAt(0);
				break;
			case 3:
				amount += 250;
				System.out.println(" Chicken added ");
				System.out.println(" You Want something Else y/n");
				ans = sc.next().charAt(0);
				break;
			case 4:
				amount += 300;
				System.out.println(" Palak Paneer added ");
				System.out.println(" You Want something Else y/n");
				ans = sc.next().charAt(0);
				break;
			case 5:
				amount += 20;
				System.out.println(" Roti(1) added ");
				System.out.println(" You Want something Else y/n");
				ans = sc.next().charAt(0);
				break;
			default:
				System.out.println("Invalid option Please select Another");
			}
			
		}while(ans == 'y' || ans == 'Y');
		//printing final amount
		System.out.println("Final Bill is "+amount);
	}

}
