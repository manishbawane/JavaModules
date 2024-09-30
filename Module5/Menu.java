package ICICIBank;
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		
		int ch;
		String choice;
		Scanner sc= new Scanner(System.in);
		
		do {
		System.out.println("ICICI Bank");
		System.out.println("1. Accept Details");
		System.out.println("2. Display Details");
		System.out.println("3. Withdraw Amount");
		System.out.println("4. Deposite Amount");
		System.out.println("5. Transfer Amount");
		System.out.println("6. Cheak Balance");
		System.out.println("7. Update Balance");
		System.out.println("8. Exit");
		
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			System.out.println("Accepting the details");
			break;
		case 2:
			System.out.println("Displaying the Details");
			break;
		case 3:
			System.out.println("Withdraw Amount");
			break;
		case 4:
			System.out.println("Deposite Amount");
			break;
		case 5:
			System.out.println("Transfer Amount");
			break;
		case 6:
			System.out.println("Cheak Balance");
			break;
		case 7:
			System.out.println("Update Balance");
			break;
		case 8:
			System.out.println("you can visit again..thank you!!");
			System.exit(0);
			
		}
		
		System.out.println("Do you want to continue?(y/n)");
		choice=sc.next();
		
		}while(choice.equalsIgnoreCase("Y"));
		System.out.println("Thanks For Visiting!!!");
	}
}
	
	

