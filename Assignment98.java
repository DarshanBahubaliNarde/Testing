package allassignments;

import java.util.Date;

public class Assignment98 {

	public static void main(String[] args) {
		
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		Date d3=new Date(d1.getTime() - (1000*60*60*24*2));
		Date d4=new Date(d1.getTime() + (1000*60*60*24*2));
		System.out.println(d2);
		
		String str=d2.toString();
		String month=str.substring(4, 7);
		String date=str.substring(8, 10);
		String year=str.substring(str.length()-4);
		
		String str1=d3.toString();
		String month11=str1.substring(4, 7);
		String date11=str1.substring(8, 10);
		String year11=str1.substring(str1.length()-4);
		
		String str2=d4.toString();
		String month22=str2.substring(4, 7);
		String date22=str2.substring(8, 10);
		String year22=str2.substring(str2.length()-4);
		
		String date1="";
		String date111="";
		String date222="";
		
		String format=date1.concat(date).concat(" ").concat(month).concat(" ").concat(year);
		String format1=date111.concat(date11).concat(" ").concat(month11).concat(" ").concat(year11);
		String format2=date222.concat(date22).concat(" ").concat(month22).concat(" ").concat(year22);
		
		System.out.println("current date - "+format);
		System.out.println("past date - "+format1);
		System.out.println("future date - "+format2);
	
	

	}

}
