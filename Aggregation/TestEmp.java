package Aggregation;

class Adress {
	String city, state, country;

	public Adress(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

}

class Emp {
	int id;
	String name;
	Adress adress; // has a relationship

	public Emp(int id, String name, Adress adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}

	public void display() {
		System.out.println("id is " + id);
		System.out.println("name is " + name);
		System.out.println(
				"city is " + adress.city + "and state is " + adress.state + "and country is " + adress.country);
	}

}

public class TestEmp {

	public static void main(String[] args) {

		Adress adress1 = new Adress(" Mumbai ", " Maharshtra ", " India ");
		Adress adress2 = new Adress(" Nashik ", " Maharshtra ", " India ");

		Emp emp1 = new Emp(1, "pratik", adress1);
		Emp emp2 = new Emp(2, "kunal", adress2);
		emp1.display();

		System.out.println("========================================");
		emp2.display();
	}
}
