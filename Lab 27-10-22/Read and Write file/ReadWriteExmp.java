package Lab_27_Oct;
	
	import java.io.FileReader;
	import java.io.FileWriter;  
	public class ReadWriteExmp {  
	    public static void main(String args[]){    
	         try{    
	           FileWriter fw=new FileWriter("Filename.text");    
	           fw.write("Files in Java might be tricky, but it is fun enough!");    
	           fw.close(); 
	           System.out.println("Successfully wrote to the file.");    
	         }  catch(Exception e) {
	            System.out.println(e);
	        }    
	          System.out.println("An error occurred");    
	     }  
	    
	} 

