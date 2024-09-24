import java.util.Scanner;
public class Reversetable 
{
   public static void main(StringMethods args[])
   {  
        int i=10,n; 
       System.out.print("Enter any number:");
       Scanner num =new Scanner(System.in);
       n=num.nextInt();

       while (i>=1) 
       {
         System.out.println(i*n);
         i--;
       }
    
   }    
}
