//WAP to accept a no from user and check it is prime or not. Pass this number in different function and check it is even or odd. IF number is even than check it is divisible by 10 or not in different function and is no is odd than check it is divisible by 3 or not in different function
package Sankets;

import java.util.Scanner;

public class Prime_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
	}
	
	public static void prime(int num) {
		int i,m,check =0;
		m=num/2;
		if(num==0||num==1) {
			System.out.println(num+" is not a prime number");
			
		}else {
			for(i=2;i<=m;i++) {
				if(num%i==0) {
					System.out.println(num + " is Not a Prime Number");
					check = 1;
					break;
				}
			}
		}
		if(check == 0) { System.out.println(num + " is Prim e Number"); }
		
		
		
	}
	
	public static void evenOdd(int num) {
		if(num%2==0) {
			System.out.println("These Number is Prime");
			DivisbleBy10(num);
		}else {
			System.out.println("These is Even Number");
			DivisbleBy3(num);
		}
		
		
	}
	
	
	
	public static void DivisbleBy10(int num){
		if(num%10==0) {
			System.out.println("Number is Divisible By 10");
		}else {
			System.out.println("Number is Not Divisible By 10");
		}
	}
	
	public static void DivisbleBy3(int num){
		if(num%3==0) {
			System.out.println("Number is Divisible By 3");
		}else {
			System.out.println("Number is Not Divisible By 3");
		}
	}

}
