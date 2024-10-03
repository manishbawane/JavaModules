package Strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("chetan");
		sb.insert(6, " new text ");
		System.out.println(sb);
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		int i=sb.indexOf("t");
		System.out.println("i is at "+ i+ " rd index ");
		
		sb.replace(4, 5, "new");
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		System.out.println(sb);
		System.out.println(sb.reverse());
	}

}
