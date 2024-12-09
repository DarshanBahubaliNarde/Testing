package allassignments;


//Method overloading of 5 static and 5 non static method 
public class Assignment24 {
	// Method overloading - 5 static methods
	public static void Addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Static method 1:- "+sum);
	}
	public static void Addition(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Static method 2:- "+sum);
	}
	public static void Addition(int a,int b,int c,int d)
	{
		int sum=a+b+c+d;
		System.out.println("Static method 3:- "+sum);
	}
	public static void Addition(int a,int b,int c,int d,int e)
	{
		int sum=a+b+c+d+e;
		System.out.println("Static method 4:- "+sum);
	}

	public static void Addition(int a,int b,int c,int d,int e,int f)
	{
		int sum=a+b+c+d+e+f;
		System.out.println("Static method 5:- "+sum);
	}
	
	// Method overloading - 5 Non static methods
	public void multiplication(int a,int b)
	{
		int mul=a*b;
		System.out.println("Non Static method 1:- "+mul);
	}
	public void multiplication(int a,int b,int c)
	{
		int mul=a*b*c;
		System.out.println("Non Static method 2:- "+mul);
	}
	public void multiplication(int a,int b,int c,int d)
	{
		int mul=a*b*c*d;
		System.out.println("Non Static method 3:- "+mul);
	}
	public void multiplication(int a,int b,int c,int d,int e)
	{
		int mul=a*b*c*d*e;
		System.out.println("Non Static method 4:- "+mul);
	}

	public void multiplication(int a,int b,int c,int d,int e,int f)
	{
		int mul=a*b*c*d*e*f;
		System.out.println("Non Static method 5:- "+mul);
	}
	
	public static void main(String[] args) {
		//calling 5 static method(method overloading
		
		Addition(10,10);
		Addition(10,10,10);
		Addition(10,10,10,10);
		Addition(10,10,10,10,10);
		Addition(10,10,10,10,10,10);

		Assignment24 AS24=new Assignment24();
		AS24.multiplication(10, 10);
		AS24.multiplication(10, 10, 10);
		AS24.multiplication(10, 10, 10, 10);
		AS24.multiplication(10, 10, 10, 10, 10);
		AS24.multiplication(10, 10, 10, 10, 10, 10);
		
	}

}
