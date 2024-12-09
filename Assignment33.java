package allassignments;


public class Assignment33 {
	

	public void darshan() {
		switch(1) {
		case 1:
			for(int i=1;i<=8;i++)
			{
				if(i==3)
				{
					continue;
				}
				System.out.println(i);
			}
			break;

		default:
			System.out.println("Invalid option");
		
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33 AS33=new Assignment33();
		AS33.darshan();
	}

}
