package test;

class Parent{
public void method(){
System.out.println("Hi i am parent");
}
}

enum MyEnum {Suchita, Vikash, Deepak };

public class inheritance_Demo {
	

		public static void main(String args[]) {

		
			for (MyEnum en: MyEnum.values())
			{
				System.out.print(en + " ");

				}

		}
}
