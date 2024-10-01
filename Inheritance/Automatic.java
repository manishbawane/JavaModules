package Inheritance;

public class Automatic extends Car {

	protected String CarFuel;
	protected int noofGears;
	protected String carModel;

	public Automatic(String carModel, String carName, double carPrice, String carOwner, String carFuel, int noofGears) {
		super(carModel, carName, carPrice, carOwner);
		CarFuel = carFuel;
		this.noofGears = noofGears;
	}

	public void  display() {
        super.display();       
    }

	@Override
	public String toString() {
		return "Automatic [CarFuel=" + CarFuel + ", noofGears=" + noofGears + ", carModel=" + carModel + ", carName="
				+ carName + ", carPrice=" + carPrice + ", carOwner=" + carOwner + "]";
	}
	
	
}
