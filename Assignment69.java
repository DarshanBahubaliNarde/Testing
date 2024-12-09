package allassignments;

public class Assignment69 {

	public static void main(String[] args) {
		
		String input="DarshaN";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			 output = output + input.charAt(i);
		}
		System.out.println(output);
	}
}
