package Lab29;

import java.util.*; 
public class Palidrome {

   public static void main(String args[])  
   {  
      String text, reverse = "";  
      Scanner sc = new Scanner(System.in);   
      System.out.println("Enter a string to check if it is a palindrome");  
      text = sc.nextLine();   
      int length = text.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + text.charAt(i);  
      if (text.equals(reverse))  
         System.out.println("Entered string is a palindrome.");  
      else  
         System.out.println("Entered string is not a palindrome.");   
   } 
} 


