//WAP to accept no from user in array and find out average and sum of array numbers.
package Sankets;

import java.util.Scanner;

public class Average {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array ");
		int size = sc.nextInt();
		int[] myArr = new int[size];
		for(int i=0;i<size;i++) {
			myArr[i] = sc.nextInt();
		}
		AverageNum(myArr);
	}
	
	public static void AverageNum(int[] arr) {
		int all=0;
		for(int i=0;i<arr.length;i++) {
			all+=arr[i];
		}
		System.out.println("Sum of all Numbers "+all);
		int ans = all/arr.length;
		System.out.println("Average Number is "+ans);
		
	}
	
}
