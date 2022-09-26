package Casting;

public class Players_Main {
	public static void main(String args[]) {
		
		Players P1 = new Players();
		P1.Stadium();
		P1.fees();
		
		
		P1 = new Cricket(); //upcasting
		P1.Stadium();
		P1.fees();
		

		if(P1 instanceof Cricket)
		{
			((Cricket) P1).award();  //down casting
		}
		
		P1 = new Hockey();
		P1.Stadium();
		P1.fees();
		}


}
