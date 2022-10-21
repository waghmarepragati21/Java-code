package lab_20_Oct;

public class ThreadSchedular implements Runnable  {
	    Thread t1; 
	    public void run() 
	    { 
	        for (int i = 0; i < 10; i++) { 
	            System.out.println( 
	                Thread.currentThread().getName() + "  "+ i); 
	            try { 
	                Thread.sleep(500); 
	            } 
	  
	            catch (Exception e) { 
	                System.out.println(e); 
	            } 
	        } 
	    } 
	  
	    public static void main(String[] args) throws Exception 
	    { 
	        Thread t1 = new Thread(new ThreadSchedular ()); 
	        Thread t2 = new Thread(new ThreadSchedular ()); 
	        
	        t1.start(); 
	  	    t2.start(); 
	    } 
	}
