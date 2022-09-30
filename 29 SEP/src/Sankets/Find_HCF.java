//Lab QUE2:Write a program to calculate HCF of Two given number.
package Sankets;

import java.util.Scanner;

public class Find_HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your first Number ");
		int num1 = sc.nextInt();
		System.out.println("Enter Your second Number ");
		int num2 = sc.nextInt();
		sc.close();
		HCF(num1,num2);
		
	}
	
	public static void HCF(int num1,int num2) {
		int hcf = 1;
	    
	    for(int i = 1; i <= num1 || i <= num2; i++) {
	        if(num1 % i == 0 && num2 % i == 0)
	            hcf = i;
	    }
	    
	    System.out.println("HCF is "+ hcf);
	}

}
