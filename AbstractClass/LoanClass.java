package AbstractClass;

public  class LoanClass extends BankAccount {

	public LoanClass(int id, float balance) {
		super(id, balance);
	}

//	public float calculateInterest() {
//		return (balance * 0.1f);
//	}

	@Override
	public float CalculateInterest() {
		return balance * 0.1f;
	}
}
