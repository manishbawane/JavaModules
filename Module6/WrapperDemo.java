package Module6;

public class WrapperDemo {

	public static void main(String[] args) {
		String str= "100";
		String str1= "200";
		String str2= "100.77";
		String str3= "1478";
		String str4= "99.99";
		
		System.out.println("total is "+ Integer.parseInt(str)+ (Integer.parseInt(str1)));

		System.out.println("========================");
		
		System.out.println("total is "+ Double.parseDouble(str2)+ (Double.parseDouble(str3)));
		
		System.out.println("========================");
		
		System.out.println("total is "+ (Float.parseFloat(str3)) + (Float.parseFloat(str4)));
		
		System.out.println("========================");
		
		System.out.println(Byte.MAX_VALUE);    //127
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);    //-128
	}
	
	

}
