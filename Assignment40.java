package allassignments;

import java.util.Scanner;

public class Assignment40 {

	public void areaOfCircle(int r)

	{
		System.out.println("Area of Circle is "+(r*r*Math.PI));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		Assignment40 AS39=new Assignment40();
		System.out.println("Enter radius = ");
		int radius=s1.nextInt();
		AS39.areaOfCircle(radius);
		
	}

}
