package allassignments;
class ParentHeirarchical
{
	void superMethod()
	{
		System.out.println("Super Method");
	}
}
class Child extends ParentHeirarchical
{
	void childMethod()
	{
		System.out.println("Child Method");
	}
}
class Child2 extends ParentHeirarchical
{
	void child2Method()
	{
		System.out.println("Child2 Method");
	}
}
public class Assignment52 {

	public static void main(String[] args) {
		ParentHeirarchical p1 = new ParentHeirarchical();
		Child c1=new Child();
		Child2 c2 = new Child2();
		p1.superMethod();
		c1.superMethod();
		c2.superMethod();

	}

}
