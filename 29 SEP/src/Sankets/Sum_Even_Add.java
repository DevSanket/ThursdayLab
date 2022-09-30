//Lab QUE1: Write a program to accept a number from user and then prints the sum of the even and odd integers.

package Sankets;

import java.util.Scanner;

public class Sum_Even_Add {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		even_odd();
	}
	
	public static int[] get_Numbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Number You are going to Enter? ");
		int size = sc.nextInt();
		int myArr[] = new int[size];
		System.out.println("Enter Your Values ");
		for(int i=0;i<size;i++) {
			myArr[i] = sc.nextInt();
		}
		sc.close();
		return myArr;
	}
	
	public static void even_odd() {
		int sum_even = 0;
		int sum_odd = 0;
		int myArr[] = get_Numbers();
		for (int i=0;i<myArr.length;i++) {
			if(myArr[i]%2==0) {
				sum_even+=myArr[i];
			}else {
				sum_odd+=myArr[i];
			}
		}
		
		System.out.println("Sum of Event number are "+sum_even);
		System.out.println("Sum of Odd number are "+sum_odd);
		
	}

}
