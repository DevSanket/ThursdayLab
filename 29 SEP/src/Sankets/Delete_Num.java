//WAP to accept size from user accordingly accept numbers from user and also accept the no from user which you want to delete from your array and display the output.
package Sankets;

import java.util.Scanner;

public class Delete_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array ");
		int size = sc.nextInt();
		int[] myArr = new int[size];
		for(int i=0;i<size;i++) {
			myArr[i] = sc.nextInt();
		}
		System.out.println("Enter a Number Which you want to Delete");
		int num = sc.nextInt();
		int[] newArray = newArr(myArr,num);
		System.out.println("New Array is "+newArray);
			
	}
	
	public static int[] newArr(int[] arr,int num) {
		int newArray[] = new int[arr.length -1];
		for(int i=0,k=0;i<arr.length;i++) {
			if(arr[i] != num) {
				newArray[k] = arr[i];
				k++;
			}
		}
		
		
		return newArray;
	}

}
