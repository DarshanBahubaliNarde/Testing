package allassignments;

public class Assignment27 {
	int a =10;
	int b =20;
	
	public void add()
	{
		System.out.println("Addition of 2 no :- "+(a+b));
	}
	public void sub()
	{
		System.out.println("substraction of 2 no :- "+(b-a));	
	}
	public void mul()
	{
		System.out.println("multiplication of 2 no :- "+(a*b));
	}
	public void div()
	{
		System.out.println("division of 2 no :- "+(b/a));
	}
	public void mod()
	{
		System.out.println("modulus of 2 no :- "+(a%b));
	}
	

	public static void main(String[] args) 
	{
		Assignment27 AS27=new Assignment27();
		AS27.add();
		AS27.sub();
		AS27.mul();
		AS27.div();
		AS27.mod();
	}

}
