package allassignments;

public class Assignment57 {
	Assignment57()
	{
		this("Darshan");
		System.out.println("Default constructor");
	}
	Assignment57(String s)
	{
		this(true);
		System.out.println(s);
	}
	Assignment57(boolean b)
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		new Assignment57();

	}

}
