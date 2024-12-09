package allassignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment109 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("First");
		c1.add("second");
		c1.add("third");
		c1.add("fouth");
		c1.add(11);
		c1.add('d');
		c1.add(100.00);
		System.out.println(c1);
		
		Iterator i= c1.iterator();
		
		while(i.hasNext()) 
		{
			System.out.println(i.next());
			
		}

	}

}
