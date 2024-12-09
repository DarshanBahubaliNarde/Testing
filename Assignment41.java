package allassignments;

import java.util.Scanner;

public class Assignment41 {

	
	public void areaOfReactangle(double l,double w) 
	{
			System.out.println("Area of Rectangle is "+(l*w));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c1=new Scanner(System.in);
		Assignment41 AC41=new Assignment41();
		System.out.println("enter Lenghth:- ");
		double length=c1.nextDouble();
		System.out.println("enter width:- ");
		double width=c1.nextDouble();
	
		AC41.areaOfReactangle(length,width);
		

	}

}
