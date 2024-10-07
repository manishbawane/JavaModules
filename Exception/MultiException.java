package Exception;

import java.util.Scanner;

public class MultiException {
	public static double divide(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any two numbers");
		String str = sc.next();
		String str1 = sc.next();

		try {
			int num1 = Integer.parseInt(str);
			int num2 = Integer.parseInt(str1);

			double result = divide(num1, num2);
			System.out.println("result is " + result);

		} catch (ArithmeticException e) {
			System.out.println("can not divide any no by o......");
		} catch (NumberFormatException e1) {
			System.out.println("the value expected is number not the string...");
		} catch (Exception e) { // Generalized exception
			System.out.println("Error: there is an error...");
		} finally {
			System.out.println("this is finally block.....");
		}

	}

}
