package allassignments;

import java.util.Scanner;

public class Assignment39 {
	public void areaOfTrangle(int height,int breadth)

	{
		System.out.println("Area of Trangle is "+(0.5*height*breadth));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s1=new Scanner(System.in);
	Assignment39 AS39=new Assignment39();
	System.out.println("Enter height = ");
	int height=s1.nextInt();
	System.out.println("Enter breadth = ");
	int breadth=s1.nextInt();
	AS39.areaOfTrangle(height, breadth);
	

	}

}
