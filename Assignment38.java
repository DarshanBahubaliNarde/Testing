package allassignments;

import java.util.Scanner;

public class Assignment38 {


	public void next(String number1)
	{
		System.out.println("String is "+number1);
	}
	
	public void nextInt(int number2)
	{
		System.out.println("integer is "+number2);
	}
	
	public void nextDouble(double number3)
	{
		System.out.println("double is "+number3);
	}
	
	public void nextFloat(float number4)
	{
		System.out.println("float is "+number4);
	}
	
	public void nextByte(byte number5)
	{
		System.out.println("byte is "+number5);
	}
	
	public void nextShort(short number6)
	{
		System.out.println("short is "+number6);
	}
	
	public void nextLong(long number7)
	{
		System.out.println("long is "+number7);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment38  AS38=new Assignment38();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter string");
		String number1=s1.next();
		System.out.println("Enter integer");
		int number2=s1.nextInt();
		System.out.println("Enter double");
		double number3=s1.nextDouble();
		System.out.println("Enter float");
		float number4=s1.nextFloat();
		System.out.println("Enter byte");
		byte number5=s1.nextByte();
		System.out.println("Enter short");
		short number6=s1.nextShort();
		System.out.println("Enter long");
		long number7=s1.nextLong();
		System.out.println("****************************************************");
		System.out.println("****************************************************");
		AS38.next(number1);
		AS38.nextInt(number2);
		AS38.nextDouble(number3);
		AS38.nextFloat(number4);
		AS38.nextByte(number5);
		AS38.nextShort(number6);
		AS38.nextLong(number7);
	}

}
