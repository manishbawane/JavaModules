package Module6;
import java.util.Scanner;
public class TestCustomer {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the customer ID: ");
		int custID=sc.nextInt();
		System.out.println("Enter the name: ");
		String name=sc.next();
		System.out.println("Enter the moible no: ");
		int mobileNO=sc.nextInt();
		System.out.println("Enter the adress: ");
		String adress=sc.next();
		
		System.out.println("creating object without para");
		Customer customer=new Customer();
		customer.setCustID(custID);
		customer.setName(name);
		customer.setMobileNO(mobileNO);
		customer.setAdress(adress);

		
		
		System.out.println("displying the details");
		System.out.println("customer id is: "+ customer.getCustID());
		System.out.println("name is "+ customer.getName());
		System.out.println("mobile no is: "+ customer.getMobileNO());
		System.out.println("adress is: "+ customer.getAdress());
		
		
		System.out.println("==================================================");
		
		
		System.out.println("creating object with parameters");
		
		Customer customer1=new Customer(33, "anand", 787879899, "tyte uytwiuy wiuyiu");
		
		System.out.println("displying the details");
		System.out.println("customer id is: "+ customer1.getCustID());
		System.out.println("name is "+ customer1.getName());
		System.out.println("mobile no is: "+ customer1.getMobileNO());
		System.out.println("adress is: "+ customer1.getAdress());
		
		System.out.println("==================================================");
	}
}
