package allassignments;

import java.util.ArrayList;
import java.util.Collection;

public class Assignment103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add("First");
		c1.add("second");
		c1.add("third");
		c1.add("fouth");
		c1.add(11);
		c1.add('d');
		c1.add(100.00);
		System.out.println(c1);
		System.out.println("collection is empty ? "+c1.isEmpty());
		c1.clear();
		System.out.println("collection is empty ? "+c1.isEmpty());

	}

}
