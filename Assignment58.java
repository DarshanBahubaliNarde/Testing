package allassignments;

class ParentOverriding
{
	void login()
	{
		System.out.println("Login with OTP");
	}
}
public class Assignment58 extends ParentOverriding{
	void login()
	{
		super.login();
		System.out.println("Login with email");
	}

	public static void main(String[] args) {
		
		Assignment58 A58 = new Assignment58();
		A58.login();

	}

}
