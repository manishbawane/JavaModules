package Module6;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		
		System.out.println("=============================================");
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
	    //2nd method: enhanced for loop
		//20 33 44 55 66
		System.out.println("================================================");
		
		for(int temp: arr)
		{
			System.out.println(temp);
		}

	}

}
