import java.util.Scanner;
public class counting 
{
    public static void printcout()
    {   
        System.out.print("enter the any number:");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
           System.out.println(i);
        }
    }
    public static void printsum()
    {
        System.out.println("enter two number:");
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        int b=num.nextInt();
        int sum =a+b;
        System.out.println("the sum is:"+sum);
    }
    public static void main(StringMethods args[])
    {
        printcout();
        printsum();
    }
}
