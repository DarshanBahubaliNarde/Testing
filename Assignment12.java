package allassignments;

public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=21;
		boolean hasStandardMembership = true;
		boolean hasVIPMembership = true;
		
		if(age>=21 && (!hasStandardMembership || hasVIPMembership))
		{
			System.out.println("you are eligible to access restricted area");
		}
		else {
			System.out.println("you are not eligible to access restricted area");
		}
	}

}
