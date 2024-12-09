package allassignments;

public class Assignment6 {

	public void AND_Operator()
	{
		int a=10,b=20;
		if(a<b && b>a) {
			System.out.println("TRUE, TRUE");
		}
		if(a<b && b<a) {
			System.out.println("TRUE, FALSE");
		}
		if(a>b && b>a) {
			System.out.println("FALSE, TRUE");
		}
		if(a>b && b<a) {
			System.out.println("FALSE, FALSE");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AND operator -Both TRUE conditions will be displayed");
		Assignment6 AS6=new Assignment6();
		AS6.AND_Operator();
	}}
