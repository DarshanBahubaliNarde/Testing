package allassignments;


interface darshan
{
	void name();
	void surname();
}

class narde implements darshan{
	public void name() {
		System.out.println("name :- DARSHAN");
		
	}
	public void surname() {
		System.out.println("surname :- NARDE");
	}
}

public class Assignment65 {
	public static void main(String[] args) {
		narde nd=new narde();
		nd.name();
		nd.surname();
		
	}

}
