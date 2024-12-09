package allassignments;

public class Assignment21 {
	//non static method
	public void add() {
		int a=10;
		int b=30;
		int sum=a+b;
		System.out.println("addition "+sum);
	}
	public static void sub() {
		int a=50;
		int b=10;
		int sub=a-b;
		System.out.println("substraction "+sub);
		
	}
	public Assignment21(){
		int a=20;
		int b=20;
		int mul=a*b;
		System.out.println("Multiplication "+mul);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment21 AS21=new Assignment21();
		AS21.add();
		sub();
		
	}

}
