package sanketscode;

import java.util.Scanner;

//WAP to create  ATM  where customer enter our details ,pin and withdrawal cash or deposit cash.. In this program you have to use encapculation for hinding user details and inheritance,polymorphism and interface.

class ATM_Operations {
	private String user_name = "";
	int balance = 0;
	int ATM_Number = 0;
	int ATM_Pin = 123;
	
	public void setValues(String user_name,int ATM_Number,int ATM_Pin) {
		this.user_name = user_name;
		this.balance = 4000;
		this.ATM_Number = ATM_Number;
		this.ATM_Pin = ATM_Pin;
		Display();
	}
	
	public void Display() {
		System.out.println("Hello "+user_name);
		System.out.println("Your Account Balance is "+balance);		
	}
	
	
	public void DebitMoney(int pin,int amount) {
		if(pin == this.ATM_Pin) {
			
			if(amount < this.balance) {
				if(amount > 0) {
					
					this.balance -= amount;
					System.out.println("Amount Debited Successfully");
				}else {
					System.out.println("Amount is Not Valid");
				}
			}else {
				System.out.println("Your Balance is Low!");
			}
			
			
		}else {
			System.out.println("Account Validation Failed");
		}
		
	}
	
	public void CreditMoney(int pin,int amount){
		if(amount > 0) {
			System.out.println("Account Updated Successfully");
		}else {
			System.out.println("Your Amount is Invalid");
		}
	}
	
	
	
}


class ATM  extends ATM_Operations {
	int ATM_Pin;
	ATM(String user_name,int ATM_Number,int ATM_Pin){
		this.ATM_Pin = ATM_Pin;
		setValues(user_name, ATM_Number, ATM_Pin);
	}
	
	public void DebitATMMoney(int pin,int amount) {
		if(ATM_Pin == pin) {
			DebitMoney(pin, amount);
		}else {
			System.out.println("Your Pin is Invalid");
		}
	}
	
	public void CreditATMMoney(int pin,int amount) {
		if(ATM_Pin == pin) {
			CreditMoney(pin, amount);
		}else {
			System.out.println("Your Pin is Invalid");
		}
	}
	
		
}

public class Que1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int check = 1;
		
		System.out.println("Enter Account Holder Name - ");
	    String name = sc.next();
	    System.out.println("Enter Your Account Pin - ");
	    int pin = sc.nextInt();
	    System.out.println("Enter ATM Number - ");
	    int atm_number = sc.nextInt();
	    ATM obj = new ATM(name,atm_number,pin);
		
	    
	    while(check != 3) {
	    		System.out.println("1. Credit Amount");
	    		System.out.println("2. Debit Amount");
	    		System.out.println("3. Exit");
	    		
	    		System.out.print("Enter Your Preference - ");
	    		check = sc.nextInt();
	    		
	    		if(check == 1) {
	    			System.out.print("Enter Amount for Credit - ");
	    			int amount = sc.nextInt();
	    			obj.CreditATMMoney(pin, amount);
	    		}else if(check == 2) {
	    			System.out.println("Enter Amount for Debit - ");
	    			int amount = sc.nextInt();
	    			obj.DebitATMMoney(pin, amount);
	    		}
	    		
	    		
	    }
	    
		
		 
		
	}
	
}
