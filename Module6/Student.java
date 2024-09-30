package Module6;

public class Student {
	private int rollNO;
	private String name;
	private double score;

	// default constructor
	public Student() {
		System.out.println("this is a default constructor");
		rollNO = 0;
		name = "";
		score = 0.0;
	}

	// Parameterized constructor
	public Student(int rollNO, String name, double score) {
		System.out.println("this is a para constructor");
		this.rollNO = rollNO;
		this.name = name;
		this.score = score;
	}

	public int getRollNO() {
		return rollNO;
	}

	public void setRollNO(int rollNO) {
		this.rollNO = rollNO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void display() {
		System.out.println("roll no is: " + rollNO);
		System.out.println("name is: " + name);
		System.out.println("score is: " + score);
	}

	public void markAttendance() {
		System.out.println("marking the attendance");
	}

}
