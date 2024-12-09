package allassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment76 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	
		
		int year[]=new int[4];
		for(int i=0;i<=year.length-1;i++)
		{
			System.out.println("inter value for index "+i);
			year[i]=input.nextInt();
			
		}
		
		System.out.println(Arrays.toString(year));

	}

	
}
