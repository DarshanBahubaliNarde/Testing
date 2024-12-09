package allassignments;

class NonStatic
{
	 void divition() 
	 {
			int a=20,b=30;
			System.out.println("Divition of "+a+" and "+b+" is "+(a/b));
		 
	 }


}
public class Assignment49 extends NonStatic {
	 void modules() 
	{
		int a=20,b=30;
		System.out.println("modules of "+a+" and "+b+" is "+(a%b));
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment49 AC49=new Assignment49();
		AC49.divition();
		AC49.modules();

	}


}
