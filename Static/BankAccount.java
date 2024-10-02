package Static;

public class BankAccount {
	private int accNo;
	private double balance;
	private static int idNum = 1;

	public BankAccount() {
		accNo = idNum++;
		balance = 0;
	}

	public BankAccount(double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}

	public static int getidNum() {
		return idNum;
	}

	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", balance=" + balance + "]";
	}

	public static void main(String[] args) {

		BankAccount bankAccount1 = new BankAccount();
		System.out.println(bankAccount1.getidNum());

		BankAccount bankAccount2 = new BankAccount(20000);
		System.out.println(bankAccount2);

		BankAccount bankAccount3 = new BankAccount(80000);
		System.out.println(bankAccount3);

	}

}
