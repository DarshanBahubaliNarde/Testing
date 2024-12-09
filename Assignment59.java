package allassignments;

public class Assignment59 {
	int global = 20;
	public void valueUpdate()
	{
		int local = 50;
		this.global = local;
		System.out.println("Local value:"+local);
		System.out.println("Global value:"+global);
	}
	public static void main(String[] args) {
		
		Assignment59 A59 = new Assignment59();
		A59.valueUpdate();

	}

}
