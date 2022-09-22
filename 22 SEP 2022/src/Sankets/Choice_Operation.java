//Q2: Write a program to accept choice from user and perform the operation:
//1: factorial
//2:sum of digit
//3:Armstrong number or not
//4:fibonacci series
//5:Prime no or Not

package Sankets;

import java.util.Scanner;

public class Choice_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getting number for operation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number - ");
		int num = sc.nextInt();
		char ans = 'y';
		
			
		
		do{
			System.out.println("Pick Your Option");
			System.out.println("1.Factorial Number");
			System.out.println("2.Sum of Digit");
			System.out.println("3.Armstrong Numebr");
			System.out.println("4.Fibbonacci series");
			System.out.println("5.Prime or not");
			
			int option = sc.nextInt(); //pick option
			
			
			switch (option){
			case 1:
				// For Factorial Number
				int val=1;
				while(num != 0) {
					val = num*val;
					num--;
				}
				System.out.println(val);
				System.out.println("Ready To Continue y/n? ");
				ans = sc.next().charAt(0);
				break;
			case 2:
				//Sum of Digit 
				int temp = num;
				int r,ans1 = 0;
				while(temp != 0) {
					r=temp%10;
					ans1 = ans1 + r;
					temp = temp/10;
				}
				System.out.println(ans1);
				System.out.println("Ready To Continue y/n? ");
				ans = sc.next().charAt(0);
				break;
			case 3:
				//Armstrong Number
				int temp1 = num;
				double ans2 = 0;
				int r1=0;
				while(temp1!= 0) {
					r1 = temp1%10;
					ans2 = ans2 + Math.pow(r1, 3);
					temp1 = temp1/10;
				}
				
				if(num == ans2) {
					System.out.println("Number is Armstrong");
				}else {
					System.out.println("Number is not Armstrong");
				}
				System.out.println("Ready To Continue y/n? ");
				ans = sc.next().charAt(0);
				break;
			case 4:
				//Fibbonachi series
				int f1=0;
				int f2=1;
				System.out.println(f1);
				System.out.println(f2);
				int temp2 = num;
				int n3 =0;
				for(int i=2;i<temp2;i++) {
					System.out.println(f1+f2);
					n3=f1+f2;
					f1=f2;
					f2= n3;
				}
				System.out.println("Ready To Continue y/n? ");
				ans = sc.next().charAt(0);
				break;
				
			case 5:
				//Prime or Not
				if(num == 0 || num == 1) {
					System.out.println(num + "Number is Not Prime");
					break;
				}else {
					int check = num/2;
					for(int i=2;i<=check;i++){      
					    if(num%i==0){      
					     System.out.println(num+" is not prime number");     
					     break;      
					    }      
					   }
					System.out.println(num+ " Number is Prime Number");
					
				}
				System.out.println("Ready To Continue y/n? ");
				ans = sc.next().charAt(0);
				break;
				
				
				
			default:
				System.out.println("Invalid option");
		
			}
				
			
			
		}while(ans == 'y' || ans == 'Y');
	}

}
