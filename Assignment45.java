package allassignments;

import java.util.Scanner;

public class Assignment45 {

	public void circumferenceOfReactangle(double l,double w) 
	{
			System.out.println("circumference of Rectangle is "+2*(l+w));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c1=new Scanner(System.in);
		Assignment45 AC45=new Assignment45();
		System.out.println("enter Lenghth:- ");
		double length=c1.nextDouble();
		System.out.println("enter width:- ");
		double width=c1.nextDouble();
	
		AC45.circumferenceOfReactangle(length,width);
		
	}

}
