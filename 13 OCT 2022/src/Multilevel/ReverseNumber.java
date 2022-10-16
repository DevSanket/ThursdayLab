package Multilevel;

public class ReverseNumber {
	 public void ReverseANumber(int num) {
		 int rev,ans=0;
		 
		 while(num != 0) {
				rev = num %10; // return a reminder 
				ans = (ans*10)+rev; // putting in ans
				num=num/10; // changing value for num
			}
		 
		 System.out.println("Reverse Number is "+ans);
		 
	 }
}
