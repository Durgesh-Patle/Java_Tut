import java.util.Scanner;
public class Gintii
{
    public static void main(StringMethods args[])
    {   
        System.out.print("Eneter any number:");
        Scanner num=new Scanner(System.in);
        int n= num.nextInt();

        for(int i=1;i<=n;i++)
        {
           if(i%2==0)
           {
            System.out.print("Even=");
            System.out.println(i);
           }
           else
           {
              System.out.print("Odd=");
              System.out.println(i);
           }
        }
    }
}
