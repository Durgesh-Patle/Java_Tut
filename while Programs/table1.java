import java.util.Scanner;

public class table1
{
    public static void main(StringMethods args[])
    {   
        int i,n;
        System.out.print("enter any number:");
        Scanner Sc=new Scanner(System.in);
         n = Sc.nextInt();

         for(i=1;i<=10;i++)
         {
            System.out.println(n*i);
         }
    }
}
