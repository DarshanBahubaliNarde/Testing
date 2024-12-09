package allassignments;

public class Assignment81 {

	public static void main(String[] args) {
	
		int age[]=new int[5];
		age[0]=5;
		age[1]=8;
		age[2]=16;
		age[3]=20;
		age[4]=5;
		
		int sum=0;
		for(int i=0;i<age.length;i++) 
		{
			sum=sum+age[i];
		}
		double average=sum/age.length;
		System.out.println("Average is "+average);
	}

}
