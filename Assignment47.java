package allassignments;

import java.util.Scanner;

public class Assignment47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1 for Chrome");
		System.out.println("Enter 2 for Edge");
		System.out.println("Enter 3 for FireFox");
		System.out.println("Enter 4 for IE");
		int number=s1.nextInt();
		switch(number) {
		case 1:
			System.out.println("Launching Chrome");
			break;
		case 2:
			System.out.println("Launching Edge");
			break;
		case 3:
			System.out.println("Launching FireFox");
			break;
		case 4:
			System.out.println("Launching IE");
			break;
		default:
			System.out.println("Invalid option");
		
		}
	}

}
