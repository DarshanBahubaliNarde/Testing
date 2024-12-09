package allassignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment101 {

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
		Collection c2=new ArrayList();
		c2.addAll(c1);
		c2.add("Extra");
		c2.add(0.2);
		c2.add(100.00);
		System.out.println(c2);
		

	}

}
