package allassignments;

public class Assignment80 {

	static int AlphaCounter=0;
	static int DigitCounter=0;
	static int SpaceCounter=0;
	static int special=0;
	public static void main(String[] args) {
	
		
	 String given_string="KV no 2";
	 char[] d1=given_string.toCharArray();
	 
	 for(int i=0;i<given_string.length();i++)
	 {
		 
		 boolean v1= Character.isAlphabetic(d1[i]);
		 boolean v2= Character.isDigit(d1[i]);
		 boolean v3= Character.isWhitespace(d1[i]);
		 
		 if(v1==true)
		 {
			 AlphaCounter++;
		 }
		 if(v2==true)
		 {
			 DigitCounter++;
		 }
		 if(v3==true)
		 {
			 SpaceCounter++;
		 }
		 
		 
	 }
	 System.out.println("No. of Alphabets "+AlphaCounter);
	 System.out.println("No. of Numeric "+DigitCounter);
	 System.out.println("No. of Spaces "+SpaceCounter);
	 int special=given_string.length()-(AlphaCounter+DigitCounter+SpaceCounter);
	 System.out.println("No. of Special characters "+special);
	}

}
