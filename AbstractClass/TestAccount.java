package AbstractClass;

public class TestAccount {

	public static void main(String[] args) {
		CurrentAccount currentAccount=new CurrentAccount(12, 231545);
		currentAccount.CalculateInterest();
		System.out.println(currentAccount.CalculateInterest());
		
		LoanClass loanClass = new LoanClass(45, 789789);
		loanClass.CalculateInterest();
		System.out.println(loanClass.CalculateInterest());
	}

}
