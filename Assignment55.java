package allassignments;
class SuperClassPara
{
	public SuperClassPara(String name) {
		System.out.println("Superclass constructor");
	}
}
class ChildClassPara extends SuperClassPara
{
	ChildClassPara()
	{
		super("Shivani");
		System.out.println("Childclass constructor");
	}
}

public class Assignment55 extends ChildClassPara {

	public static void main(String[] args) {
		new Assignment55();

	}

}
