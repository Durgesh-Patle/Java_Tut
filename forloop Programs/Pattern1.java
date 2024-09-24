import java.util.Scanner;
 public class Pattern1
{  
   public static void main(StringMethods args[])
   {
      System.out.print("Enter any number:");
      Scanner num=new Scanner(System.in);

      int n=num.nextInt();
      for(int i=1;i<=n;i++)
    { 
        for(int j=1;j<=i;j++)
     {
        System.out.print( i );
     }
     System.out.println( " ");

    }

   } 

}