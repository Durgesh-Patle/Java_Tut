import java.util.Scanner;
public class Reversetable 
{
   public static void main(String args[])
   {  
    int i=10,n;
    System.out.print("enter any number:");
    Scanner num=new Scanner(System.in);
    n=num.nextInt();
    do 
    {
      System.out.println(i*n); 
      i--;   
    } while (i>=1);
    
   }    
}
