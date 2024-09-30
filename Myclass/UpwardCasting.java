package Myclass;

public class UpwardCasting {

	public static void main(String[] args) {
		int a=100;
		double d=a;              //upward casting : automatically
		System.out.println(d);
		
		double d1=66.99;
		int i=(int)d1;           //downward casting : explicit
		System.out.println(i);

	}

}
