package Module6;

public class Customer {

	private int custID;
	private String name;
	private int mobileNO;
	private String adress;

	// def constructor
	public Customer() {
		System.out.println("this is a default constructor");
		custID = 0;
		name = "";
		mobileNO = 0;
		adress = null;
	}

	// para constructor
	public Customer(int custID, String name, int mobileNO, String adress) {
		System.out.println("this is a para customer");
		this.custID = custID;
		this.name = name;
		this.mobileNO = mobileNO;
		this.adress = adress;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(int mobileNO) {
		this.mobileNO = mobileNO;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", name=" + name + ", mobileNO=" + mobileNO + ", adress=" + adress + "]";
	}

//	public void display() {
//		System.out.println("customer ID is: " + custID);
//		System.out.println("name is: " + name);
//		System.out.println("mobile no is: " + mobileNO);
//		System.out.println("adress is: + adress");
//	}
	
	
}
