package Myclass;

public class ForDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				//break;         //upto 4 if sop written before condition
			    continue;        //5 will be skipped 
			System.out.println(i);
		}
	}
}
