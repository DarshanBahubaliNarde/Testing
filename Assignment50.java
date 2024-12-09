package allassignments;

public class Assignment50 extends Assignment50a{
	
	
	 void modules() 
	{
		int a=20,b=30;
		System.out.println("modules of "+a+" and "+b+" is "+(a%b));
		
	}
	
	 static void multiplication() 
	{
		int a=20,b=30;
		System.out.println("multiplication of "+a+" and "+b+" is "+(a*b));
			
	}

	public static void main(String[] args) {
		
		Assignment50 AS50=new Assignment50();
		addition();
		multiplication();
		AS50.modules();
		AS50.divition();
		
		
		
	
		

	}

}
