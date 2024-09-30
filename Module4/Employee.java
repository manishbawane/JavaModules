package Module4;

import java.util.Scanner;

public class Employee {

	private int empNO;
	private String ename;
	private double bal;
	
	Scanner sc= new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter employee No, employee name, and balance");
		empNO=sc.nextInt();
		ename=sc.next();
		bal=sc.nextDouble();
		
	}
	
	public void cheakEmpNo()
	{
		if(empNO>0)
			System.out.println("valid employess no");
		else if(empNO>1000)
			System.out.println("invalid employess no");	
	}
	
	public void cheakbal()
	{
		if(bal>0 && bal<1000000)
			System.out.println("valid salary");
		else if(bal<0 && bal>1000000)
			System.out.println("inValid salary");
	}
	
	public void display()
	{
		System.out.println("Employee name : "+ ename);
		System.out.println("Employee NO is : " + empNO);
		System.out.println("balace of employee is : " + bal);
	}
}
