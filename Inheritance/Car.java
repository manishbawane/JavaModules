package Inheritance;

class Car {
    protected String carModel;
    protected String carName;
    protected double carPrice;
    protected String carOwner;

    
    public Car(String carModel, String carName, double carPrice, String carOwner) {
		super();
		this.carModel = carModel;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carOwner = carOwner;
	}


	public void  display() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Name: " + carName);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Owner: " + carOwner);
        System.out.println("------------------------------");
    }


	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carName=" + carName + ", carPrice=" + carPrice + ", carOwner="
				+ carOwner + "]";
	}
    
    
}