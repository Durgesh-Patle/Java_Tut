import java.util.Scanner;
public class gintii 
{
    public static void main(StringMethods args[])
    {   
        System.out.print("Enter any number:");
        Scanner Sc=new Scanner(System.in);
        int n= Sc.nextInt();
        int i=1;
        do
        {
           System.out.println(i);
           i++;
        }while(i<=n);
    }
}
