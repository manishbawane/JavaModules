package AbstractClass;

public  class CurrentAccount extends BankAccount {

	public CurrentAccount(int id, float balance) {
		super(id, balance);
	}

//	public float calculateInterest() {
//		return (balance * 0.07f);
//	}

	@Override
	public float CalculateInterest() {
		// TODO Auto-generated method stub
		return balance * 0.07f;
	}
}
