import java.util.Scanner;
public class Table
{
    public static void main(StringMethods agrs[])
    {   
        int n,i;
        System.out.print("enter any number:");
        Scanner num = new Scanner(System.in);
         n= num.nextInt();
         for(i=1;i<=10;i++)
         {  
           // System.out.println("");
            System.out.println(i*n);
         }

    }
}
