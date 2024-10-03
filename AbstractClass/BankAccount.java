package AbstractClass;

public abstract class BankAccount {

	protected int id;;
	protected float balance;

	public abstract float CalculateInterest();

	
	public BankAccount(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

}
