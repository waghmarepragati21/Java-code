package Lab_27_Oct;

	import java.util.Scanner;  
	public class ScannerClass {    
	    public static void main(String args[]){       
	        Scanner sc = new Scanner (System.in);  
	 
	        int a = sc.nextInt();  
	        System.out.print(a);  
	       
	        double d = sc.nextDouble();  
	        System.out.print(d);
	        
	        String s = sc.nextLine();
	        System.out.println(s);
	        sc.nextLine();
	        boolean b = sc.nextBoolean();
	        System.out.println(b);  
	        sc.close();  
	        }   
	    } 
