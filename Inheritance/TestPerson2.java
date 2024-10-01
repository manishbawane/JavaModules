package Inheritance;

public class TestPerson2 {

	public static void main(String[] args) {
		//Creating an array of objects
		//int[] arr=new int[5]
		Person[] arr=new Person[5];
		arr[0]=new Person("zahid", 22, 'M');
		arr[1]=new Person("pratima", 23, 'M');
		arr[2]=new Person("dipali", 21, 'M');
		arr[3]=new Person("pratik", 23, 'M');
		arr[4]=new Person("swapnil", 25, 'M');
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
