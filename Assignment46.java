package allassignments;

import java.util.Scanner;

public class Assignment46 {

	public void circumferenceOfSquare(double s)

	{
		System.out.println("circumference of square is "+4*s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		Assignment46 AS46=new Assignment46();
		System.out.println("Enter side = ");
		double side=s1.nextDouble();
		AS46.circumferenceOfSquare(side);

	}

}
