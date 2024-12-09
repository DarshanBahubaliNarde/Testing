package allassignments;

import java.util.Scanner;

public class Assignment42 {

	public void areaOfSquare(double s)

	{
		System.out.println("Area of square is "+(s*s));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		Assignment42 AS42=new Assignment42();
		System.out.println("Enter side = ");
		double side=s1.nextDouble();
		AS42.areaOfSquare(side);
	}

}
