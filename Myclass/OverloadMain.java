package Myclass;

public class OverloadMain {
	
	static public void main()
	{
		System.out.println("main method without parameters");
	}
	
	static public void main(int a,int b)
	{
		System.out.println("main method with 2 parameters");
	}
	
	static public void main(int a)
	{
		System.out.println("main method with 1 parameter");
	}
	
    
	public static void main(String[] args) {
		
		 main();              //we can directly call method if ur not performing any operation.
		 main(10);
		 main(10,33);
	}
}
