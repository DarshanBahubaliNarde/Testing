package allassignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment106 {

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
		c1.remove("First");
		System.out.println(c1);
		

	}

}
