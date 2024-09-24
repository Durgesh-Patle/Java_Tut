import java.util.Scanner;
public class Reversetable 
{
    public static void main(String args[])
    {
        System.out.print("Enter any number:");
        Scanner num=new Scanner(System.in);
        int n=num.nextInt();
        int i;
         for(i=10;i>=1;i--)
         {  
           System.out.println(i*n);
         }
    }
}
