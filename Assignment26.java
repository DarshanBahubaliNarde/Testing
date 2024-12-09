package allassignments;

public class Assignment26 {
	
	int a=10;
	static int b=10;
	public void addition()
	{
		int a=10;
		int b=10;
		a=50;
		int sum=a+b;
		System.out.println("Addition of updated local variable "+sum);
	}

	public static void main(String[] args) {
	
		Assignment26 AS26=new Assignment26();
		AS26.addition();
		b=30;
		AS26.a=50;
		System.out.println("updated value of global non static variable "+AS26.a);
		System.out.println("updated value of global static variable "+b);
		
	}

}
