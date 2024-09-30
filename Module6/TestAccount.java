package Module6;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		account.setAccNO(4555);
		account.setAccName("pratik");
		account.setAccBalance(798897);
		System.out.println(account);

		System.out.println("===============================================");

		System.out.println("creating 2nd object");
		Account account1 = new Account(78, "Manish", 99000);
		System.out.println(account1);

	}

}
