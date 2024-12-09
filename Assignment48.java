package allassignments;


class Parent {
	
	static void addition() 
	{
		int a=20,b=30;
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		
	}
	
}
public class Assignment48 extends Parent{
	
	static void multiplication() 
	{
		int a=20,b=30;
		System.out.println("multiplication of "+a+" and "+b+" is "+(a*b));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition();
		multiplication();
		
	}

}
