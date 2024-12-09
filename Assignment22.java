package allassignments;

public class Assignment22 {

	public Assignment22(){
		System.out.println("Constructor without parameter");
	}
	public Assignment22(int a){
		System.out.println("Constructor with int parameter that is "+a);
	}
	public Assignment22(double a){
		System.out.println("Constructor with float parameter that is "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment22 AS22=new Assignment22();
		Assignment22 AS22a=new Assignment22(21);
		Assignment22 AS22b=new Assignment22(21.21);
	}

}