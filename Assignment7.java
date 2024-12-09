package allassignments;

public class Assignment7 {
	
	public void OR_Operator()
	{
		int a=10,b=20;
		if(a<b || b>a) {
			System.out.println("TRUE, TRUE");
		}
		if(a<b || b<a) {
			System.out.println("TRUE, FALSE");
		}
		if(a>b || b>a) {
			System.out.println("FALSE, TRUE");
		}
		if(a>b || b<a) {
			System.out.println("FALSE, FALSE");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OR operator -Both False condition will not be displayed");
		Assignment7 AS7=new Assignment7();
		AS7.OR_Operator();
	}

}
