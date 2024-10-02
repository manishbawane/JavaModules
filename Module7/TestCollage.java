package Module7;

class Stream {
	private String name;
	private int fees;
	private int noOfStudents;

	public Stream(String name, int fees, int noOfStudents) {
		super();
		this.name = name;
		this.fees = fees;
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Stream [name=" + name + ", fees=" + fees + ", noOfStudents=" + noOfStudents + "]";
	}

}

class Collage {
	private String name;
	private char grade;
	private String adress;
	private String contactNo;

	public Collage(String name, char grade, String adress, String contactNo) {
		super();
		this.name = name;
		this.grade = grade;
		this.adress = adress;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Collage [name=" + name + ", grade=" + grade + ", adress=" + adress + ", contactNo=" + contactNo + "]";
	}

	public class TestCollage {

		public static void main(String[] args) {

			Collage collage = new Collage("MET", 'A', "Nashik", "12113 666 22");
			Stream Stream1 = new Stream("CS", 70000, 80);
			Stream Stream2 = new Stream("IT", 80000, 85);
			Stream Stream3 = new Stream("MECH", 70000, 80);
			Stream Stream4 = new Stream("ELE", 80000, 75);
			Stream Stream5 = new Stream("CIVIL", 70000, 85);

			// to display all the details
			System.out.println(collage);
			System.out.println(Stream1);
			System.out.println(Stream2);
			System.out.println(Stream3);
			System.out.println(Stream4);
			System.out.println(Stream5);

		}

	}
}
