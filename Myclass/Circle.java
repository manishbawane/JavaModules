package Myclass;

import java.util.Scanner;

public class Circle {

	private double radius;
	private double area1;;
	private double peri;
	
	final double PI=3.14;      //for const variable use final
	Scanner sc= new Scanner(System.in);  
	
	public void accept()
	{
		System.out.println("Enter the radius");
		radius=sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("the radius is : " +radius);
		System.out.println("the area of circle is : "+area1);
		System.out.println("the peri of the circle is : "+peri);
	}
	
	public void cheakArea()
	{
		area1= 2 * radius * radius;
	
	}
	
	public void cheakPeri()
	{
		peri= 2 * PI * radius;
	}
}
