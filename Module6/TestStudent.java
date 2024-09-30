package Module6;
import java.util.Scanner;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter rollNO: ");
		int rollNO=sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter score: ");
		double score=sc.nextDouble();
		
		System.out.println("creating object without para");
		Student student=new Student();
		student.setRollNO(rollNO);   //used setter to set values 
		student.setName(name);
		student.setScore(score);
		
//		student.display();
		System.out.println("displying the details");
		System.out.println("roll no is "+ student.getRollNO());
		System.out.println("name is "+ student.getName());
		System.out.println("score is "+ student.getScore());
		
		
		student.markAttendance();
		
		System.out.println("==================");
		
		System.out.println("creating object with parameters");
		Student student2= new Student(9, "Manish" , 96);
		
		
//		student2.display();
		
		System.out.println("displying the details");
		System.out.println("roll no is "+ student2.getRollNO());
		System.out.println("name is "+ student2.getName());
		System.out.println("score is "+ student2.getScore());
		
		
		student2.markAttendance();
		
		System.out.println("changing the name....");
		System.out.println("Enter the new name: ");
		String name1=sc.next();
		student2.setName(name1);
		System.out.println("new name is: "+ student2.getName());
		
		System.out.println("changing the roll no....");
		System.out.println("Enter the new roll no: ");
		int rollNO1=sc.nextInt();
		student2.setRollNO(rollNO1);
		System.out.println("new roll no is: "+ student2.getRollNO());
		
		System.out.println("changing the score...");
		System.out.println("Enter new score: ");
		double score1=sc.nextDouble();
		student2.setScore(score1);
		System.out.println("new score is: "+ student2.getScore());
	    
	}

}
