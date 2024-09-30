package Myclass;

public class OverLoadingDemo {
	//we don't need object if you are using static.
	//we did not have to create an object to call the static method.

	static public int add(int a,int b)
	{
		return a+b;
	}
	
	static public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	
	static public double add(int a,double b)
	{
		return a+b;
	}
	
	public static void main(String[]args)
	{
		int result=add(66,33);
		System.out.println(result);
		
		double result1=add(11,30.33);
		System.out.println(result1);
		
		int result2=add(20,30,40);
		System.out.println(result2);
	}
}
