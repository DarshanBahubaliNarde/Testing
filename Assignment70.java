package allassignments;

public class Assignment70 {

	public static void main(String[] args) {
		
		String input="sos";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			 output = output + input.charAt(i);
		}
	
		if(input.equals(output)==true) {
			
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
