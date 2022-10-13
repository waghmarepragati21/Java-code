package lab_13Oct;

public class Userdefined extends Exception {
    public  Userdefined(String a)
    {
        super(a);
    }
	
	
		public static void main(String args[])
		{
			try {  

				int x=20,y=0;
				System.out.println(x/y);
				}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
				System.out.println("Caught the exception : Number cannot divided by Zero");
				System.out.println("End of process");
				
			}
}