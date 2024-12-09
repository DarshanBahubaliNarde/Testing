package allassignments;


interface vahical {
 void cycle();    
 void gearBike();  
}


abstract class Bike1 implements vahical {

 public void gearBike() {
     System.out.println("ride gearBike");
 }

 public abstract void nonGearBike();
 
}


class cycles extends Bike1 {
	

 public void cycle() {
     System.out.println("ride cycle");
 }

@Override
public void nonGearBike() {
	System.out.println("ride nonGearBike");
	
}
}

public class Assignment66 {

	public static void main(String[] args) {
		cycles cs=new cycles();
		 cs.cycle();
		 cs.gearBike();
		 cs.nonGearBike();

	}

}
