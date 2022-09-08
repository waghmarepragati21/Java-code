import java.util.Scanner;

public class Pattern2
{
    public static void main(String[] args)
    {
Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the number of rows needed to in the pattern: ");
   int k = scanner.nextInt();
     
        for (int i=1; i<=k; i++)
        {
            for (int j=1; j<=k; j++)
            {
                if(j==i || j==k-i+1)
                {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
