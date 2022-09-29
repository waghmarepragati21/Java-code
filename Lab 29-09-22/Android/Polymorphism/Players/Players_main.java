package Polymorphism.java;


public class Players_main {
	public static void main(String args[]) {
		
		Players P1 = new Players();
		P1.Stadium();
		P1.fees();
		
		
		P1 = new Cricketer(); //upcasting
		P1.Stadium();
		P1.fees();
		

		if(P1 instanceof Cricketer)
		{
			((Cricketer) P1).award();  //down casting
		}
		
		P1 = new Hockey();
		P1.Stadium();
		P1.fees();
		}


}
