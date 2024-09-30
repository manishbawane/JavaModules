package Module6;

public class Account {

	private int accNO;
	private String accName;
	private double accBalance;
	
	//def constructor
	public Account() {
		System.out.println("DEFAULT CONTRA.");
		accNO = 0;
		accName = "";
		accBalance = 0;
	}
	
	public Account(int accNO, String accName, double accBalance) {
		System.out.println("PARA CONTRA");
		this.accNO=accNO;
		this.accName=accName;
		this.accBalance=accBalance;
	}

	public int getAccNO() {
		return accNO;
	}

	public void setAccNO(int accNO) {
		this.accNO = accNO;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Account [accNO=" + accNO + ", accName=" + accName + ", accBalance=" + accBalance + "]";
	}
	
	
}
