package Module1;

public class railway {
	//mv
	public int platformNo, railwayTiming;
	public String railwayName;
	public long pnrNO;
	
	//mf
	public void ticketCheaking()
	{
		System.out.println("cheaking the passangers tickets");
	}
	public void passengersSeating()
	{
		System.out.println("passangers are seating in trains");
	}
	public void arangingRailways()
	{
		System.out.println("railways are coming and gpoing");
	}
	
	public void display()
	{
		System.out.println("railway name is = "+ railwayName);
		System.out.println("PNR no of railway = "+pnrNO);
		System.out.println("platform no. = "+platformNo);
		System.out.println("Leaving platform at = "+railwayTiming);
	}
     
	public static void main(String[]args)
	{
		System.out.println("Creating the object");
		railway railway=new railway();
		railway.railwayName="Maharastra Express";
		railway.platformNo=1;
		railway.pnrNO= 7987984654l;
		railway.railwayTiming=(int) 9.30;
		
		System.out.println("calling the mf");
		railway.display();
		railway.ticketCheaking();
		railway.passengersSeating();
		railway.arangingRailways();		
	}
	
	

}



