package Inheritance;

public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person("Manish", 24, 'M');
		System.out.println(person); // will call toString() method
		person.display();
		person.func1();

		System.out.println("====================================================================");
		Student student = new Student("Anil", 25, 'M', 25, "Mech", 26);
		System.out.println(student);
		student.display();

		System.out.println("=====================================================================");
		Emp emp = new Emp("Anil", 25, 'M', 24, "Mech", 26, 28, "saurav", 'M');
		System.out.println(emp);
		System.out.println("======================================================================");

		Person person2 = new Person("uma", 22, 'f');
		System.out.println(person2);
		System.out.println("=======================================================================");

		person2 = new Student("saurav", 24, 'M', 33, "mech", 77);
		System.out.println(person2);
		System.out.println("========================================================================");

		person2 = new Emp("saurav", 24, 'M', 33, "mech", 77, 70, "IT", 50000);
		System.out.println(person2);
		System.out.println("========================================================================");

	}

}
