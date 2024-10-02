package Static;

public class StaticVarDemo {
	static int num;
	static double PI;
	static double TAX;
	
	static {
		num=10;
		PI=3.14;
		TAX=0.10;
	}
	
	
	public void display() {
		num++;
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		System.out.println(num);                  //1st method to call num
		System.out.println(StaticVarDemo.num);       //2nd method to call num
		
		StaticVarDemo obj=new StaticVarDemo();
		obj.display();
	}

}
