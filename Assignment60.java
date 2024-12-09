package allassignments;

public class Assignment60 {
	public void add()
	{
		System.out.println("its public add method");
	}
	private void sub()
	{
		System.out.println("its priavte sub method");

	}
	protected void div()
	{
		System.out.println("its protected div method");

	}
    void mod()
	{
		System.out.println("its default mod method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment60 AS60=new Assignment60();
		AS60.add();
		AS60.sub();
		AS60.div();
		AS60.mod();
		

	}

}
