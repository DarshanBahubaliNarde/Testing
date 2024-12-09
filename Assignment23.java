package allassignments;

public class Assignment23 {
	
	public void methodOverloading(){
		System.out.println("Method without parameter");
	}
	public void methodOverloading(int a){
		System.out.println("Method with int parameter that is "+a);
	}
	public void methodOverloading(double a){
		System.out.println("Method with float parameter that is "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment23 AS23=new Assignment23();
		AS23.methodOverloading();
		AS23.methodOverloading(21);
		AS23.methodOverloading(21.21);
	}

}
