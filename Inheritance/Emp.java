package Inheritance;

public class Emp extends Student {

	private int empno;
	private String company;
	private int sal;
	
	
	public Emp(String name, int age, char gender, int rollNO, String stream, double score, int empno, String company,
			int sal) {
		super(name, age, gender, rollNO, stream, score);
		this.empno = empno;
		this.company = company;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", company=" + company + ", sal=" + sal + ", rollNO=" + rollNO + ", stream="
				+ stream + ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
