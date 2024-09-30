package Module1;

public class Student {
	//mv
	private int rollNo;
	private String name;
	private double score;
	
	//mf
	public void attendClass()
	{
		System.out.println("attending the class");
	}
	public void apperExam()
	{
		System.out.println("aapearing for the exam");
	}
	public void completeExam()
	{
		System.out.println("completing the exam");
	}
	
	public void display()
	{
		System.out.println("roll no is = "+rollNo);
		System.out.println("name is = "+name);
		System.out.println("score is = "+score);
	}

	public static void main(String[]args)
	{
		System.out.println("Creating the object");
		Student student=new Student();
		//assigning the values for mf
		student.rollNo=1;
		student.name="Manish";
		student.score=90.00;
		
		System.out.println("calling the mf");
		student.display();
        student.apperExam();
        student.completeExam();
        student.attendClass();
        
	}
}
