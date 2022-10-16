//WAP to create a class which contain the method Palindrom .the second class will use the proerty of first class and display the output."

package palindrom;

public class AcceptPalindrom {
	public static void Palindrom(int num){
		int temp = num;
		int r,ans = 0;
		while(num != 0) {
			r = num %10; // return a reminder 
			ans = (ans*10)+r; // putting in ans
			num=num/10; // changing value for num
			
		}
		
		if(temp == ans) {
			System.out.println("Value is Palindrome "+ans);
		}else {
			System.out.println("Value is not Palindrome "+ans);
		}
	}
}
