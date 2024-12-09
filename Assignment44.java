package allassignments;

import java.util.Scanner;

public class Assignment44 {

	public void circumferenceOfCircle(int r)

	{
		System.out.println("circumference of Circle is "+(2*Math.PI*r));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		Assignment44 AS44=new Assignment44();
		System.out.println("Enter radius = ");
		int radius=s1.nextInt();
		AS44.circumferenceOfCircle(radius);

	}

}
