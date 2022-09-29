package Lab29;


public class Institute_main {
	
public static void main(String args[]) {
		
		institute c1 = new institute();
		c1.instituteName();
		c1.Course();
		c1.fees();
		
		
		c1 = new PrimeTutoral(); //upcasting
		c1.instituteName();
		c1.Course();
		c1.fees();
		

		if(c1 instanceof CodingElements)
		{
			((CodingElements) c1).Placement();  //down casting
		}
		
		c1 = new CodingElements();
		c1.instituteName();
		c1.Course();
		c1.fees();
}

}
