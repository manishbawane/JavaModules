package Module3;

import java.util.Scanner;

public class User {

	private String name;
	private int age;
	private double sal;
	
	Scanner sc= new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter name, age, and salary");
		name=sc.next();
		age=sc.nextInt();
		sal=sc.nextDouble();
	}
	
	public void cheakAge()
	{
		if(age>18)
			System.out.println("You are eligible to vote");
		else if(age>18 && age<100)
			System.out.println("Valid age");
	}
	
	public void cheaksal()
	{
		if(sal>0 && sal<100000)
			System.out.println("valid salary");
		else if(sal<0 && sal>100000)
			System.out.println("inValid salary");
	}
	
	public void display()
	{
		System.out.println("name is : "+ name);
		System.out.println("age is : " + age);
		System.out.println("salary is : " + sal);
		
	}
}

