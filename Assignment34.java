package allassignments;

public class Assignment34 {

	public void switchcase() 
	{
		switch("even")
		{
		case "odd":
		{
			System.out.println("Odd No:-");
			for(int i=1;i<=10;i++)
			{
			if(!(i%2==0))
			{
				System.out.println(i);
			}
			}
			break;
		}
		case "even":
		{
			System.out.println("even No:-");
			for(int i=1;i<=10;i++)
			{
			if(i%2==0)
			{
				System.out.println(i);
			}
			}
			break;
		}
		default:
		
			System.out.println("invalid option");
		
		}
	} 
	
	public static void main(String[] args) {

		Assignment34 AS34=new Assignment34();
		AS34.switchcase();
	}
}
