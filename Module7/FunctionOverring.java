package Module7;

class Shape {
	void calArea(String shape, int a, int b) {
		System.out.println("calArea of shape class");
	}

	void display() {
		System.out.println("display of shape class");
	}

	void fun1() {
		System.out.println("fun1 of shape class");
	}
}

class Rectangle extends Shape {
	void calArea(String shape, int a, int b) {
		{
			System.out.println("Area is " + (a * b));
		}
	}

	void display() {
		super.display();
		super.fun1();
	}
}

public class FunctionOverring {

	public static void main(String[] args) {

		Shape shape = new Shape(); // //Static binding
		shape.calArea("shape", 10, 20);
		shape.display();

		System.out.println("======================================================");

		Rectangle rect = new Rectangle(); // Static binding
		rect.calArea("Rectangle", 20, 30);
		rect.display();

		System.out.println("======================================================");

		shape = new Rectangle(); // Dynamic binding
		shape.calArea("rect", 20, 22);
		shape.display();

		System.out.println("======================================================");

	}

}
