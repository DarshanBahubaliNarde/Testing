package allassignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Assignment111 {

	public static void main(String[] args) {
		List c1=new ArrayList();
		c1.add("First");
		c1.add("second");
		c1.add(11);
		c1.add('d');
		c1.add(100.00);
		System.out.println(c1);

		System.out.println("\nForward iteration \n");
		Iterator i= c1.iterator();
		
		while(i.hasNext()) 
		{
			System.out.println(i.next());
			
		}
		
		ListIterator li= c1.listIterator();
		System.out.println("\n LIST Forward iteration \n");
		while(li.hasNext()) 
		{
			System.out.println(li.next());
		}
		System.out.println("\n LIST Backword iteration \n");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
		
	}

}
