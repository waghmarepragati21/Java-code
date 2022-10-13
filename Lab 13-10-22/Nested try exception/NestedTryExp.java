package lab_13Oct;

public class NestedTryExp {

		
		public static void main(String[] args) {
			
	
			try{    
				String name = null;
			
		        try
		        {
		        	if (name.equals("Nested Try"))
		                System.out.print("Same");
		            else
		                System.out.print("Not Same");
		        }
		       
		        catch(NullPointerException e)
		        {
		            System.out.print("Value cannot be null");
		        }
				    
				  
					    try{    
					    int a[]=new int[6];    
					     a[6]=3;    
					     }
					
					    catch(ArrayIndexOutOfBoundsException e)  
					    {  
					       System.out.println(e);  
					    }    
					  
					    System.out.println("value should be available");    
					  }  
			
				  catch(Exception e)  
				  {  
				    System.out.println("End of process");  
				  }    
				    
				  System.out.println("Thank you");    
				 }    

		}
