package StaticNested;
class OuterClass{
	private static String msg="welcome to nested classes";
	
	public static class NestedStaticClass{
		public void printMessage() {
			System.out.println("msg from nested static class"+ msg);
		}
	}
	
	public class InnerClass{
		public void display() {
			System.out.println("msg from non static nested class"+ msg);
		}
	}
}
public class ClassesNested {

	public static void main(String[] args) {
		
		OuterClass.NestedStaticClass printer=new OuterClass.NestedStaticClass();
		OuterClass inner = new OuterClass();
		
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner1 = outer.new InnerClass();
		inner1.display();

	}


}
