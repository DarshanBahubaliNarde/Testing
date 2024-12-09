package allassignments;

public class Assignment11 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		boolean hasLicense = true;
		boolean hasCompletedTraning = true;
		
		if(!(age>=18 && hasLicense && hasCompletedTraning))
		{
		
			System.out.println("you are not eligible to ride a non-gear bike");
		}
		else {
			System.out.println("you are eligible to ride a non-gear bike");
		}

}
}