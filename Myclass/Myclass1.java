package Myclass;

class Myclass2{
	public void fun1()
	{
		System.out.println("this is fun1");
	}
}
	
class Myclass3{
	public void fun2()
	{
		System.out.println("this is fun2");
	}
}

public class Myclass1 {

	public static void main(String[] args) {
		Myclass2 myclass2 = new Myclass2();
		myclass2.fun1();
		
		Myclass3 myclass3 = new Myclass3();
		myclass3.fun2();
	}

}

