package allassignments;

abstract class Bike
{
	public abstract void gearBike();
	public abstract void nonGearBike();
	
	public void superBike() 
	{
		System.out.println("Hayabusa is super bike");
	}
	
	public static void regularBike()
	{
		System.out.println("Splendor is regular bike");
	}
	
	
} 
public class Assignment64 extends Bike {
	


	@Override
	public void gearBike() {
	
	System.out.println("gear bikes");	
	}

	@Override
	public void nonGearBike() {
	System.out.println("non gear bikes");
		
	}
	public static void main(String[] args) 
	
	{
		Assignment64 AS64=new Assignment64();
		AS64.gearBike();
		AS64.nonGearBike();
		AS64.superBike();
		regularBike();
		
	}


}