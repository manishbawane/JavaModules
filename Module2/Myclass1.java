package Module2;

import java.util.Scanner;

public class Myclass1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number");
		int num= sc.nextInt();
		
		if(num >=0 && num <10)
			System.out.println("1 digit number");
		else if(num >=10 && num <100)
			System.out.println("2 digit number");
		else if(num >=100 && num <1000)
			System.out.println("3 digit number");
		else if(num >=1000 && num <10000)
			System.out.println("4 digit number");
        //3,4 digits
	}

}
//accept 3 nos from user and print greatest one.
