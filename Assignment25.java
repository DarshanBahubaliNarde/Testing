package allassignments;


//Method overloading and Constructor overloading

public class Assignment25 
{
	
	//Method overloading
	public void addition(int a,int b) 
	{
		int sum=a+b;
		System.out.println("Method overloading :- Addition of two no "+sum);
	}
	public void addition(int a,int b,int c) 
	{
		int sum=a+b+c;
		System.out.println("Method overloading :- Addition of three no "+sum);
	}

	//constructor overloading
	public Assignment25(int a,int b)
	{
		int mul=a*b;
		System.out.println("Constructor overloading :- Multiplication of two no "+mul);
		
	}
	//constructor overloading
	public Assignment25(int a,int b,int c)
	{
		int mul=a*b*c;
		System.out.println("Constructor overloading :- Multiplication of three no "+mul);
		
	}
	public static void main(String[] args) 
	{
		Assignment25 AS25a=new Assignment25(10,10);
		Assignment25 AS25b=new Assignment25(10,10,10);
		AS25a.addition(50,50);
		AS25a.addition(50, 50, 50);
	}

}
