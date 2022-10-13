package lab_13Oct;

public class BufferBuilder {
	public static void main (String[] args)
	{
		StringBuffer sb1= new StringBuffer("Pragati");
		StringBuilder sb2= new StringBuilder("hello");
		
		 System.out.println(sb1.equals(sb2));
		  
		    System.out.println(sb1.reverse());
		    
		    System.out.println(sb1.append("hello"));
		    
		 
	        sb1.insert(0, "hey"); 
	        System.out.println(sb1);
	        
	
	        System.out.println(sb2.delete(0, 2));
	}

}
