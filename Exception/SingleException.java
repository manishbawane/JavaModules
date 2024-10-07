package Exception;

import java.util.Scanner;

public class SingleException {
	public static double divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter any two numbers");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			double result = divide(num1, num2);

			System.out.println("result is " + result);

		} catch (Exception e) { // Exception keyword is imp

			// Exception is a class and e is a object

			System.out.println("we can not " + "divide any number by 0..");
			 System.out.println(e.getMessage());
			 e.printStackTrace();
			System.out.println(e);
		}

	}

}
