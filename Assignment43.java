package allassignments;

import java.util.Scanner;

public class Assignment43 {

	public void circumferenceOfTrangle(double s1,double s2,double s3)

	{
		System.out.println("circumference of trangle is "+(s1+s2+s3));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		Assignment43 AS43=new Assignment43();
		System.out.println("Enter length of side 1 = ");
		double side1=s1.nextDouble();
		System.out.println("Enter length of side 2 = ");
		double side2=s1.nextDouble();
		System.out.println("Enter length of side 3 = ");
		double side3=s1.nextDouble();
		AS43.circumferenceOfTrangle(side1,side2,side3);

	}

}
