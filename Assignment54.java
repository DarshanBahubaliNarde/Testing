package allassignments;

class SuperClassNonPara
{
	SuperClassNonPara()
	{
		System.out.println("Superclass constructor");
	}
}
public class Assignment54  extends SuperClassNonPara{
	Assignment54()
	{
		super();
		System.out.println("Childclass constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Assignment54();
	}

}
