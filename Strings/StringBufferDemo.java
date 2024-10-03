package Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Manish");
		
		sb.append(" cdac nashik ");
		System.out.println(sb);
		
		int i=sb.indexOf("a");
		System.out.println("i is "+ i);
		int i1=sb.lastIndexOf("c");
		System.out.println(i1);
		
		sb.replace(6, 11, " Bawane ");
		System.out.println(sb);
		
		sb.delete(6,10);
		System.out.println(sb);
	}

}
