package Inheritance;

public class TestClass {

	public static void main(String[] args) {
		Car car=new Car( "audi Q7", "audi", 9000000, "Manish");
		System.out.println(car); 
		car.display();
		
		System.out.println("====================================================================");
		
		Automatic automatic=new Automatic("BMW Zx", "BMW", 9000000, "Manish","audi Q7", 9000000);
		System.out.println(automatic);
		car.display();
	}

}
