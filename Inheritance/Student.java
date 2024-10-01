package Inheritance;

public class Student extends Person {

   //roll no , stream , score
	protected int rollNO;
	protected String stream;
	protected double score;
	
	
	public Student(String name, int age, char gender, int rollNO, String stream, double score) {
		super(name, age, gender);          //calling constructor of the parent class
		this.rollNO = rollNO;
		this.stream = stream;
		this.score = score;
	}
	
	public void display()
	{
		super.display();                  //calling the method of parent class
		super.func1();
	}

	@Override
	public String toString() {
		return "Student [rollNO=" + rollNO + ", stream=" + stream + ", score=" + score + ", name=" + name + ", age="
				+ age + ", gender=" + gender + "]";
	}

	
	
	
	
	
}
