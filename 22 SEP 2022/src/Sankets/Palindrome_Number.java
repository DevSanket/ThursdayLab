//Q1: Write a program to accept a number from the user and check if a given number is palindrome or not.

package Sankets;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Palindrom number in when we reverse the number it remains the same
		System.out.println("Enter A Number ");
		
		//get the number
		int num = sc.nextInt();
		int r,ans = 0;
		
		int temp = num;
		
		while(num != 0) {
			r = num %10; // return a reminder 
			ans = (ans*10)+r; // putting in ans
			num=num/10; // changing value for num
			
		}
		
		//our num == 0 so use temp where we store our value
		
		//Checking Conditions
		if(temp == ans) {
			System.out.println("Value is Palindrome "+ans);
		}else {
			System.out.println("Value is not Palindrome "+ans);
		}
		
	}

}
