package allassignments;

class Parent11 {
    Parent11() {
        System.out.println("Parent constructor");
    }
}

class Child11 extends Parent11 {
    Child11() {
        super();
        System.out.println("Child constructor");
    }
}

class GrandChild extends Child11 {
    GrandChild() {
        super(); 
        System.out.println("GrandChild constructor");
    }
}

public class Assignment56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GrandChild();

	}

}
