package Module2;
import java.util.Scanner;
public class switchDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num= sc.nextInt();
		
		switch(num)
		{
		case 5:
			System.out.println("Movie Time");
			break;
			
		case 6:
			System.out.println("Super Saturday");
			break;
			
		case 7:
			System.out.println("Fun Sunday");
			break;
			
		default :
			System.out.println("It is weekdays guys..work");
			break;
		}

	}

}
