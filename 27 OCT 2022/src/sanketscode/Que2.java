// Write a program to accept basic details name , Phone No , Address , user Id and password from the user . throw an exception if the user Id length is greater than 8 and password is not matched and should only contain the string value. Password rules: A password must have at least eight characters. A password consists of only letters and digits. A password must contain at least two digits.

package sanketscode;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		
		
		//1. Accept Basic Details Name,Phone no,Address, userId,password s
		System.out.println("Enter Your Name - ");
		String name = sc.next();
		System.out.println("Enter Your Phone No - ");
		int phone_no = sc.nextInt(); 
		System.out.println("Enter Your Address - ");
		String address = sc.next();
		
		
		try {
			// 2. throw exception if userId is Greater then 8 
			System.out.println("Enter UserId - ");
			String userId = sc.next();
			
			if(userId.length() <= 8) {
				throw new Exception("Enter usedId at least 8 character long");
			}
			
			System.out.println("Enter Password - ");
			String password = sc.next();
			
			
			// 3. Password at least 8 characters 
			
			if(password.length() <= 8) {
				throw new Exception("Enter Password at least 8 character long");
			}
			
			// 4. password contains only letters digit 
			
			
			
			//5. Password containes at least 2 digits
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
	}

}
