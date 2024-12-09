package allassignments;

public class Assignment78 {

	public static void main(String[] args) {
		int no[]=new int[4];
		no[0]=10;
		no[1]=20;
		no[2]=30;
		no[3]=40;
		
		int given_no=30;
		for(int i=0;i<=no.length-1;i++)
		{
			if(given_no==no[i]) 
			{
				System.out.println("Number is present in array at index position "+i);
			}
	
		}
		

	}

}
