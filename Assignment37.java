package allassignments;

import java.util.Scanner;

public class Assignment37 {

	public void add(int a,int b) 
	{
		int sum=a+b;
		System.out.println("Addition of 2 no "+sum );
	}

	public void sub(int a,int b)
	{
		int sub=a-b;
		System.out.println("Addition of 2 no "+sub );
	}
	public void mul(int a,int b)
	{
		int mul=a*b;
		System.out.println("Addition of 2 no "+mul );
	}
	
	public void div(int a,int b)
	{
		int div=a/b;
		System.out.println("Addition of 2 no "+div );
	}
	
	public void mod(int a,int b)
	{
		int mod=a%b;
		System.out.println("Addition of 2 no "+mod );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		Assignment37 AS37=new Assignment37();
		System.out.println("Enter first number");
		int num1= s1.nextInt();
		System.out.println("Enter second number");
		int num2= s1.nextInt();
		AS37.add(num1, num2);
		AS37.sub(num1, num2);
		AS37.mul(num1, num2);
		AS37.div(num1, num2);
		AS37.mod(num1, num2);
		
	}

}
